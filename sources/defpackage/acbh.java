package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbh implements Callable {
    private final bye a;
    private final acbd b;
    private final Uri c;

    public acbh(bye byeVar, Uri uri, acbd acbdVar) {
        this.b = acbdVar;
        this.a = byeVar;
        this.c = uri;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws IOException {
        int i;
        fgg fggVar;
        byi byiVar = new byi(this.c, 0L, -1L, null);
        bxx bxxVar = new bxx();
        bzf bzfVar = new bzf(this.a, bxxVar);
        bzfVar.b(byiVar);
        do {
            i = 0;
        } while (bzfVar.a(new byte[SemanticState.Multiline], 0, SemanticState.Multiline) > 0);
        bzfVar.f();
        ByteArrayOutputStream byteArrayOutputStream = bxxVar.a;
        byte[] byteArray = byteArrayOutputStream == null ? null : byteArrayOutputStream.toByteArray();
        if (byteArray == null || byteArray.length == 0) {
            throw new IOException("Received empty segment");
        }
        bwb bwbVar = new bwb(byteArray);
        acbg acbgVar = new acbg();
        aumd aumdVar = new aumd(bwbVar.b);
        aumc aumcVar = new aumc();
        long jC = aumdVar.c();
        acbi acbiVar = acbi.b;
        aumcVar.h = aumdVar;
        aumcVar.e = aumdVar.b();
        aumdVar.d(aumdVar.b() + jC);
        aumcVar.f = aumdVar.b();
        aumcVar.c = acbiVar;
        long j = 1;
        long j2 = 0;
        while (aumcVar.hasNext()) {
            fge next = aumcVar.next();
            String strC = next.c();
            switch (strC.hashCode()) {
                case 3117308:
                    if (strC.equals("emsg")) {
                        bwbVar.P(((int) next.a()) + 8);
                        bwbVar.w();
                        String strS = bwbVar.S();
                        bwbVar.S();
                        bwbVar.w();
                        bwbVar.w();
                        bwbVar.w();
                        bwbVar.w();
                        ywx ywxVar = new ywx(typ.c(strS), ywx.e(bwbVar));
                        String str = ywxVar.a;
                        if (str.equals("http://youtube.com/streaming/metadata/segment/102015")) {
                            acbgVar.c = ywxVar;
                        } else if (str.equals("http://youtube.com/streaming/metadata/streamer/092019")) {
                            acbgVar.d = ywxVar;
                        }
                    }
                    break;
                case 3346442:
                    if (strC.equals("mdat")) {
                        acbd acbdVar = this.b;
                        bwbVar.P(((int) next.a()) + 8);
                        acbdVar.b(acbgVar, bwbVar, TimeUnit.SECONDS.toMillis(j2 / j), ((int) next.b()) - 8);
                    }
                    break;
                case 3357433:
                    if (strC.equals("moof")) {
                        List listG = ((aulz) next).g(fgj.class);
                        if (!listG.isEmpty()) {
                            List listG2 = ((fgj) listG.get(i)).g(fgi.class);
                            if (!listG2.isEmpty()) {
                                j2 = ((fgi) listG2.get(i)).a;
                            }
                        }
                    }
                    break;
                case 3357449:
                    if (strC.equals("moov")) {
                        Iterator it = ((aulz) next).f().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                fge fgeVar = (fge) it.next();
                                if (fgeVar instanceof fgg) {
                                    fggVar = (fgg) fgeVar;
                                }
                            } else {
                                fggVar = null;
                            }
                        }
                        if (fggVar != null) {
                            long j3 = fggVar.a;
                            if (j3 > 0) {
                                j = j3;
                            }
                        }
                    }
                    break;
            }
            i = 0;
        }
        if (acbgVar.c == null) {
            throw new bsz("Missing emsg", null, true, 1);
        }
        if (acbgVar.b != null) {
            return new aeqc(acbgVar);
        }
        throw new bsz("Missing segment time", null, true, 1);
    }
}
