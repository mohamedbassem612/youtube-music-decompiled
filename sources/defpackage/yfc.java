package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yfc extends zja {
    private final Set a;
    private Uri b;
    private String c;
    private long d;
    private int e;

    public yfc(Set set, int i, String str) {
        super(new jsx(str), i);
        this.a = set;
    }

    private final boolean g() throws EOFException {
        String str = this.c;
        if (str != null) {
            for (jsk jskVar : this.a) {
                jsp jspVarC = jskVar.c(str, this.d);
                if (jspVarC != null) {
                    if (jspVarC.d) {
                        File file = jspVarC.e;
                        if (file != null) {
                            Uri uriFromFile = Uri.fromFile(file);
                            long j = this.d - jspVarC.b;
                            long j2 = jspVarC.c - j;
                            if (j2 <= 0) {
                                throw new EOFException();
                            }
                            byh byhVar = new byh();
                            byhVar.a = uriFromFile;
                            byhVar.g = j;
                            byhVar.b = this.d - j;
                            byhVar.h = j2;
                            byhVar.i = str;
                            byhVar.j = this.e;
                            super.b(byhVar.a());
                            return true;
                        }
                    } else {
                        jskVar.l(jspVarC);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.zja, defpackage.ziq, defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        int iA = super.a(bArr, i, i2);
        if (iA >= 0) {
            this.d += (long) iA;
            return iA;
        }
        super.f();
        if (g()) {
            return a(bArr, i, i2);
        }
        return -1;
    }

    @Override // defpackage.zja, defpackage.ziq, defpackage.bye
    public final long b(byi byiVar) throws EOFException {
        this.b = byiVar.a;
        this.c = byiVar.j;
        this.d = byiVar.h;
        this.e = byiVar.k;
        g();
        return byiVar.i;
    }

    @Override // defpackage.ziq, defpackage.bye
    public final Uri c() {
        return this.b;
    }

    @Override // defpackage.ziq, defpackage.bye
    public final void f() {
        this.b = null;
        super.f();
    }
}
