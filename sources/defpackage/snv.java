package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.youtube.music.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snv {
    public final Bitmap a;
    public final acdq b;
    public boolean f;
    private final acdw g;
    private final snu h;
    public int d = 2;
    public sgs e = sgs.d;
    public final Set c = new HashSet();

    public snv(Context context, acdw acdwVar, acdq acdqVar, avlh avlhVar, acdx acdxVar, abmt abmtVar) {
        this.g = acdwVar;
        this.b = acdqVar;
        this.a = BitmapFactory.decodeResource(context.getResources(), R.drawable.quantum_ic_cast_connected_white_24);
        if (abmtVar.K()) {
            this.h = new snu(this, acdxVar);
        } else {
            avlhVar.p().ak(new rlb(this, 19));
            this.h = null;
        }
    }

    private final void e(abuz abuzVar) {
        acdq acdqVar = this.b;
        if (abuzVar == null) {
            acdqVar.k(acdqVar.p(), this.a);
        } else {
            acdqVar.K(abuzVar);
            this.g.c(abuzVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [acdx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [acdx, java.lang.Object] */
    public final void a(sok sokVar) {
        snu snuVar = this.h;
        if (snuVar != null) {
            CharSequence charSequence = sokVar.b;
            if (charSequence != null && charSequence.length() > 0) {
                snuVar.a.k(charSequence);
            }
            snuVar.a.i(typ.b(sokVar.c));
            aqmh aqmhVar = sokVar.d;
            snuVar.b(aqmhVar != null ? new abuz(aqmhVar) : null);
            return;
        }
        CharSequence charSequenceU = sokVar.b;
        acdq acdqVar = this.b;
        if (charSequenceU == null || charSequenceU.length() == 0) {
            charSequenceU = acdqVar.u();
        }
        acdqVar.I(charSequenceU, sokVar.c);
        aqmh aqmhVar2 = sokVar.d;
        e(aqmhVar2 != null ? new abuz(aqmhVar2) : null);
    }

    public final void b(sgs sgsVar, int i) {
        this.e = sgsVar;
        if (this.d != i) {
            this.d = i;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                abrt abrtVar = ((snx) it.next()).a;
                if (abrtVar != null) {
                    abrtVar.c(false);
                }
            }
        }
    }

    public final void c() {
        if (this.h == null) {
            this.b.c();
            e(null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [acdx, java.lang.Object] */
    public final void d(wjf wjfVar) {
        String strF;
        String strF2;
        snu snuVar = this.h;
        if (snuVar != null) {
            if (wjfVar == null) {
                strF2 = null;
                wjfVar = null;
            } else {
                strF2 = wjfVar.F();
            }
            snuVar.a.k(typ.b(strF2));
            if (((snv) snuVar.b).b.q() == null) {
                snuVar.b(wjfVar != null ? wjfVar.af() : null);
                return;
            }
            return;
        }
        if (wjfVar == null) {
            wjfVar = null;
            strF = null;
        } else {
            strF = wjfVar.F();
        }
        acdq acdqVar = this.b;
        acdqVar.I(strF, acdqVar.t());
        if (acdqVar.q() == null) {
            e(wjfVar != null ? wjfVar.af() : null);
        }
    }
}
