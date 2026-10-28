package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wlj extends wli {
    final agek l;
    final agek m;
    final agek n;
    final List o;
    public aihn p;
    public boolean q;
    final /* synthetic */ wll r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlj(wll wllVar, agek agekVar, agek agekVar2, agek agekVar3, aihn aihnVar, byte b, boolean z) {
        super(wllVar, aihnVar, b, z);
        this.r = wllVar;
        this.l = agekVar;
        this.m = agekVar2;
        this.n = agekVar3;
        this.o = new ArrayList();
    }

    final void d() {
        this.p = null;
        this.q = false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    final boolean e(alei aleiVar, long j) {
        Object objEl;
        this.q = false;
        Object objE = null;
        this.p = null;
        String strZ = ahno.Z((String) this.n.apply(aleiVar));
        if (this.a.equals(strZ)) {
            return false;
        }
        if (strZ.length() > 0) {
            this.a = strZ;
        }
        aigj aigjVarV = (aigj) this.m.apply(aleiVar);
        if (aigjVarV.E()) {
            String strCg = zik.cg((String) this.l.apply(aleiVar));
            try {
                aigjVarV = aigj.v(Base64.decode(strCg, 8));
            } catch (IllegalArgumentException e) {
                zvp.b(zvn.b, zvm.e, a.bU((byte) 46, strCg, "Unable to decode "), e);
                aigjVarV = aigj.d;
            }
        }
        if (!aigjVarV.E()) {
            try {
                objE = this.g.getParserForType().e(aigjVarV, this.r.b(32));
            } catch (aiik e2) {
                wll.h("Failed parse BytesSerialized", e2);
            }
        }
        if (objE != null) {
            this.q = true;
            this.p = (aihn) objE;
            if (this.i && (objE instanceof alik)) {
                alik alikVar = (alik) objE;
                aihn aihnVar = this.f;
                if (aihnVar instanceof alik) {
                    objEl = yno.el(alikVar, (alik) aihnVar);
                } else {
                    objEl = objE;
                }
            } else {
                objEl = objE;
            }
            a((aihn) objEl, j);
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((wlk) it.next()).d(this);
            }
        }
        return objE != null || strZ.length() > 0;
    }
}
