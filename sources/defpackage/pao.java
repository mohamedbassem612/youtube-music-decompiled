package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pao implements pal {
    public static final agsn a = agsn.h("GnpSdk");
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final phn e;
    public final awou f;
    private final aunn g;
    private final pxh h;

    public pao(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, pxh pxhVar, phn phnVar, awou awouVar) {
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        pxhVar.getClass();
        awouVar.getClass();
        this.g = aunnVar;
        this.b = aunnVar2;
        this.c = aunnVar3;
        this.d = aunnVar4;
        this.h = pxhVar;
        this.e = phnVar;
        this.f = awouVar;
    }

    @Override // defpackage.pal
    public final void a(Context context, final Intent intent) {
        int iP;
        context.getClass();
        if (intent == null || !nvg.a(intent) || intent.getBooleanExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", false)) {
            return;
        }
        intent.putExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", true);
        this.h.a(context.getApplicationContext());
        final String strH = pho.h(intent);
        final String strG = pho.g(intent);
        final aiff aiffVarE = pho.e(intent);
        final ahza ahzaVarC = pho.c(intent);
        if (strH == null && strG == null) {
            return;
        }
        final int iR = pho.r(intent);
        String strF = pho.f(intent);
        if (strF != null && awrc.n(strF, "com.google.android.libraries.notifications.ACTION_ID:", false) && (iP = awrc.p(strF, "com.google.android.libraries.notifications.ACTION_ID:", 0, false)) >= 0) {
            int i = iP + 53;
            if (i < iP) {
                throw new IndexOutOfBoundsException(a.cj(iP, i, "End index (", ") is less than start index (", ")."));
            }
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) strF, 0, iP);
            sb.append((CharSequence) "");
            sb.append((CharSequence) strF, i, strF.length());
            strF = sb.toString();
        }
        final String str = strF;
        ((pni) this.g.io()).a(new Runnable() { // from class: pam
            @Override // java.lang.Runnable
            public final void run() {
                pao paoVar = this.a;
                int i2 = iR;
                aiff aiffVar = aiffVarE;
                Intent intent2 = intent;
                String str2 = strG;
                String str3 = str;
                ahza ahzaVar = ahzaVarC;
                int threadPriority = Process.getThreadPriority(0);
                try {
                    Process.setThreadPriority(10);
                    awou awouVar = paoVar.f;
                    plx plxVar = (plx) awqx.l(awouVar, new gmc(paoVar, intent2, (awoq) null, 10));
                    if (plxVar != null) {
                        String str4 = strH;
                        agke agkeVarR = str4 != null ? ((omm) paoVar.b.io()).r(plxVar, str4) : ((omm) paoVar.b.io()).q(plxVar, str2);
                        for (pyp pypVar : (Set) paoVar.d.io()) {
                            agkeVarR.getClass();
                            aguu.T(agkeVarR);
                            pypVar.f();
                        }
                        awqx.l(awouVar, new pan(paoVar, i2, str3, plxVar, agkeVarR, aiffVar, intent2, ahzaVar, null));
                    }
                } finally {
                    Process.setThreadPriority(threadPriority);
                }
            }
        });
    }
}
