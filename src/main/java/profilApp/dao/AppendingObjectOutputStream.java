package profilApp.dao;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class AppendingObjectOutputStream extends ObjectOutputStream {
    public AppendingObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // Fayl mövcud olarsa, başlıq yazılmır
        reset();
    }
}

