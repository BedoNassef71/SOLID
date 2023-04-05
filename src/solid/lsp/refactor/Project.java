/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.lsp.refactor;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Project {

    private ArrayList<Document> allDocs;
    private ArrayList<WritableDocument> writableDocs;

    public void openAll() {
        for (Document document : allDocs) {
            document.open();
        }
    }

    public void saveAll() {
        for (WritableDocument document : writableDocs) {
            document.save();
        }
    }
}
