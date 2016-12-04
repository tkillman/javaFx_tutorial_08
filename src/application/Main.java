package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//////// �̹��� �ֱ� 
// 1. image ��ü ����
// 2. imageView�� ���� node ����
// 3. node�� Container�� �ִ´�.
public class Main extends Application {
	
	Image img = new Image("file:Koala.jpg");
	
	@Override
	public void start(Stage stage) {
		try {
			// node
			ImageView iv= new ImageView(img);
			
			//Containder
			StackPane pane = new StackPane();
			pane.getChildren().add(iv);
			iv.setPreserveRatio(true); // ���� ����
			iv.setFitWidth(500); // �� ����
			
			//iv.setRotate(90); �̹��� ȸ��
			//iv.setFitHeight(300);
			Scene scene = new Scene(pane, 800, 500);
			stage.setScene(scene);
			
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
