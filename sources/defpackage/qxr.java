package defpackage;

import android.content.Context;
import j$.nio.file.FileSystems;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxr {
    public static final rbm e = new rbm("qxr");
    public final Path a;
    public final Context b;
    public final Map c = new HashMap();
    public final bxp d;

    public qxr(Context context, boolean z) {
        this.b = context;
        this.a = FileSystems.getDefault().getPath(context.getCacheDir().getAbsolutePath(), "me_cache");
        this.d = z ? new bxp(context) : null;
    }

    public final void a() {
        try {
            b();
            Path path = this.a;
            if (Files.exists(path, new LinkOption[0])) {
                return;
            }
            Files.createDirectory(path, new FileAttribute[0]);
        } catch (IOException e2) {
            rbc rbcVar = new rbc(e, rbd.d);
            rbcVar.c();
            rbcVar.a = e2;
            rbcVar.a("Failed to create cache directory.", new Object[0]);
        }
    }

    public final void b() {
        Path path = this.a;
        if (Files.exists(path, new LinkOption[0])) {
            bwp.V(path.toFile());
        }
    }
}
