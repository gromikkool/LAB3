package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collection;

public class Main extends Application {
    public TreeView<String> treeView;



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Reestr");
        primaryStage.setScene(new Scene(root, 300, 275));
        treeView = (TreeView<String>) root.lookup("#treeView");
        TreeItem<String> treeItems = new TreeItem<>();
        Collection<TreeItem<String>> collection = new ArrayList<>(5);
        Collection<TreeItem<String>> collection1 = new ArrayList<>(10);
        TreeItem<String>treeItems2 = new TreeItem<>();
        for (int i=0;i<=5;i++) {

            collection.add(new TreeItem<String>(String.valueOf(i)));
        }
        for(int j=0; j<=10; j++)
        {
            collection1.add(new TreeItem<String>(String.valueOf(j)));

        }

        treeItems.getChildren().addAll(collection);


        treeView.setRoot(treeItems);
        primaryStage.show();

    }

    public Collection<String> Add(Collection<String> collection, Collection<String> collection1)
    {


        return collection;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
