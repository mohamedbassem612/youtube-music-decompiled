package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpt implements qqv {
    public final qqa a;

    public qpt() {
        this(new qqa());
    }

    @Override // defpackage.qqv
    public final long a(Uri uri) throws qqb {
        File fileE = rmp.E(uri);
        if (fileE.isDirectory()) {
            return 0L;
        }
        return fileE.length();
    }

    @Override // defpackage.qqv
    public final qqa b() {
        return this.a;
    }

    @Override // defpackage.qqv
    public final File c(Uri uri) {
        return rmp.E(uri);
    }

    @Override // defpackage.qqv
    public final InputStream d(Uri uri) throws qqb {
        File fileE = rmp.E(uri);
        return new qqg(new FileInputStream(fileE), fileE);
    }

    @Override // defpackage.qqv
    public final OutputStream e(Uri uri) throws qqb {
        File fileE = rmp.E(uri);
        agyo.b(fileE);
        return new qqh(new FileOutputStream(fileE, true), fileE);
    }

    @Override // defpackage.qqv
    public final OutputStream f(Uri uri) throws qqb {
        File fileE = rmp.E(uri);
        agyo.b(fileE);
        return new qqh(new FileOutputStream(fileE), fileE);
    }

    @Override // defpackage.qqv
    public final Iterable g(Uri uri) throws IOException {
        File fileE = rmp.E(uri);
        if (!fileE.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        File[] fileArrListFiles = fileE.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.endsWith("/")) {
                absolutePath = String.valueOf(absolutePath).concat("/");
            }
            Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
            agjz agjzVar = new agjz(4);
            builderPath.path(absolutePath);
            arrayList.add(rmp.F(builderPath, agjzVar));
        }
        return arrayList;
    }

    @Override // defpackage.qqv
    public final String h() {
        return "file";
    }

    @Override // defpackage.qqv
    public final void i(Uri uri) throws IOException {
        if (!rmp.E(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", uri));
        }
    }

    @Override // defpackage.qqv
    public final void j(Uri uri) throws IOException {
        File fileE = rmp.E(uri);
        if (!fileE.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        if (!fileE.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.qqv
    public final void k(Uri uri) throws IOException {
        File fileE = rmp.E(uri);
        if (fileE.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileE.delete()) {
            return;
        }
        if (!fileE.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.qqv
    public final void l(Uri uri, Uri uri2) throws IOException {
        File fileE = rmp.E(uri);
        File fileE2 = rmp.E(uri2);
        agyo.b(fileE2);
        if (!fileE.renameTo(fileE2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.qqv
    public final boolean m(Uri uri) {
        return rmp.E(uri).exists();
    }

    @Override // defpackage.qqv
    public final boolean n(Uri uri) {
        return rmp.E(uri).isDirectory();
    }

    public qpt(qqa qqaVar) {
        this.a = qqaVar;
    }
}
