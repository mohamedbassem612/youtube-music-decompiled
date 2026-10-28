package defpackage;

import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wdn extends wcz {
    private final web a;
    private final String b;
    private final aijp c;

    public wdn(web webVar, String str, aijp aijpVar) {
        this.a = webVar;
        this.b = str;
        this.c = aijpVar;
    }

    @Override // defpackage.wcz
    public final void b(wdl wdlVar, omr omrVar, agjz agjzVar) throws wcm {
        wff wffVarI;
        web webVar = this.a;
        boolean z = false;
        if (webVar.b) {
            try {
                wffVarI = webVar.i(omrVar, this.b);
            } catch (SQLiteBlobTooBigException unused) {
                wffVarI = wff.a;
                z = true;
            }
        } else {
            wffVarI = this.a.i(omrVar, this.b);
        }
        if (wey.b(wffVarI.d, this.c)) {
            weh wehVar = wffVarI.b;
            if (z || wehVar != null) {
                if (agjzVar != null) {
                    aaun aaunVar = new aaun();
                    aaunVar.d(this.b);
                    aaunVar.f = wehVar;
                    aaunVar.e(wffVarI.c);
                    aaunVar.c(wej.a);
                    agjzVar.h(aaunVar.b());
                }
                String str = this.b;
                try {
                    String[] strArr = {str};
                    omr.f();
                    afuu afuuVarF = afwt.f(39, a.ca("key=?", "entity_table", "DELETE FROM ", " WHERE "));
                    try {
                        ((SQLiteDatabase) omrVar.b).delete("entity_table", "key=?", strArr);
                        afuuVarF.close();
                        tzk.P(omrVar, str);
                    } catch (Throwable th) {
                        try {
                            afuuVarF.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw wcm.a(e, (int) c(str), 4, 5);
                }
            }
        }
    }
}
