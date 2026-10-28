package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ovl implements Closeable {
    public boolean a = false;
    public final List b = new ArrayList();

    public final synchronized void a(Closeable closeable) {
        if (!this.a) {
            this.b.remove(closeable);
        }
    }

    public final synchronized boolean b() {
        return this.b.isEmpty();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            List list = this.b;
            ArrayList arrayList = new ArrayList(list);
            list.clear();
            int size = arrayList.size();
            IOException iOException = null;
            for (int i = 0; i < size; i++) {
                try {
                    ((Closeable) arrayList.get(i)).close();
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    } else {
                        iOException.addSuppressed(e);
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        }
    }
}
