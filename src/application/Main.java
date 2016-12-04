package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//////// 이미지 넣기 
// 1. image 객체 생성
// 2. imageView를 통한 node 생성
// 3. node를 Container에 넣는다.
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
			iv.setPreserveRatio(true); // 비율 유지
			iv.setFitWidth(500); // 폭 조정
			
			//iv.setRotate(90); 이미지 회전
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
