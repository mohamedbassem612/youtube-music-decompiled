package defpackage;

import android.net.Uri;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class absz extends absv {
    public static final /* synthetic */ int a = 0;
    private final zgy b;
    private final vxz c;

    public absz(zgy zgyVar, vxz vxzVar) {
        this.b = zgyVar;
        this.c = vxzVar;
    }

    @Override // defpackage.absv
    protected final void a(Uri uri, Header header, HttpResponse httpResponse) {
        abst abstVarA = abst.a(uri);
        if (abstVarA == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        String queryParameter = uri.getQueryParameter("s");
        if (queryParameter == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        long j = abstVarA.d;
        boolean z = abstVarA.f;
        Uri uri2 = Uri.parse(queryParameter);
        if (z) {
            absu absuVarA = absu.a(null, -1L);
            bye byeVarA = this.b.a();
            byh byhVar = new byh();
            byhVar.a = uri2;
            byhVar.g = absuVarA.a;
            byhVar.h = -1L;
            byhVar.i = null;
            byhVar.j = 4;
            if (this.c.m(14, 45627566L)) {
                ypp yppVarA = ypq.a();
                yppVarA.j(tok.PLAYER_EXO_REQUEST_HANDLER);
                byhVar.k = yppVarA.a();
            }
            try {
                long jB = byeVarA.b(byhVar.a());
                byeVarA.f();
                j = jB;
            } catch (IOException unused) {
                j = -1;
            }
        }
        absu absuVarA2 = absu.a(header, j);
        long j2 = absuVarA2.c;
        String strBu = j2 != -1 ? zik.bu(abstVarA.a, abstVarA.b, abstVarA.c, abstVarA.e) : null;
        byh byhVar2 = new byh();
        byhVar2.a = uri2;
        long j3 = absuVarA2.a;
        byhVar2.g = j3;
        byhVar2.i = strBu;
        byhVar2.j = 4;
        if (j2 != -1) {
            byhVar2.h = (absuVarA2.b - j3) + 1;
        }
        if (this.c.m(14, 45627566L)) {
            ypp yppVarA2 = ypq.a();
            yppVarA2.j(tok.PLAYER_EXO_REQUEST_HANDLER);
            byhVar2.k = yppVarA2.a();
        }
        byi byiVarA = byhVar2.a();
        bye byeVarA2 = this.b.a();
        if (absuVarA2.b(httpResponse)) {
            httpResponse.setEntity(new absx(byeVarA2, byiVarA));
        }
    }
}
