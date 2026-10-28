package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adxp {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final boolean b;
    public adtv c;
    public adxv d;
    public aqi e;
    public ahsx f;
    private acjx g;

    public adxp(adtv adtvVar, acjx acjxVar, adxv adxvVar, boolean z) {
        this.g = acjxVar;
        this.c = adtvVar;
        this.d = adxvVar;
        this.b = z;
    }

    public static final ListenableFuture h(String str) {
        aihf aihfVarCreateBuilder = asii.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxp) aihfVarCreateBuilder2.instance).b = 9;
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxp) aihfVarCreateBuilder2.instance).c = str;
        atxp atxpVar = (atxp) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        asii asiiVar = (asii) aihfVarCreateBuilder.instance;
        atxpVar.getClass();
        asiiVar.c = atxpVar;
        asiiVar.b |= 1;
        return ahng.n((asii) aihfVarCreateBuilder.build());
    }

    public final synchronized acjx a() {
        return this.g;
    }

    public final synchronized void b(adtv adtvVar) {
        this.c = adtvVar;
    }

    public final synchronized void c(adxv adxvVar) {
        this.d = adxvVar;
    }

    public final synchronized void d(wgd wgdVar) {
        if (wgdVar != null) {
            agke agkeVarA = wgdVar.a();
            int size = agkeVarA.size();
            int i = 0;
            while (i < size) {
                acjx acjxVar = (acjx) agkeVarA.get(i);
                i++;
                if (acjxVar.a() == acjw.j) {
                    this.g = acjxVar;
                }
            }
            this.g = null;
        } else {
            this.g = null;
        }
        throw th;
    }

    public final synchronized boolean e() {
        return this.c == null || this.d == null;
    }
}
