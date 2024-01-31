import java.io.File;
import java.nio.file.Files;

public class GoogleDriveAdapter implements PersistenciaArquivos{

    private GoogleDrive googleDrive;

    public GoogleDriveAdapter(GoogleDrive googleDrive) {
        this.googleDrive = googleDrive;
    }

    @Override
    public void gravar(File file) {
        try {
            // Converte o arquivo em um array de bytes
            byte[] data = Files.readAllBytes(file.toPath());
            // Usa o objeto googleDrive para enviar o arquivo para o Google Drive
            googleDrive.send(data, file.getName());
        } catch (Exception e) {
            // Trata qualquer exceção que possa ocorrer
            e.printStackTrace();
        }
    }

    @Override
    public File ler(String nome) {
        try {
            // Usa o objeto googleDrive para obter o arquivo do Google Drive
            byte[] data = googleDrive.get(nome);
            // Converte o array de bytes de volta em um arquivo
            File file = new File(nome);
            Files.write(file.toPath(), data);
            return file;
        } catch (Exception e) {
            // Trata qualquer exceção que possa ocorrer
            e.printStackTrace();
        }
        return null;
    }
}
