package defpackage;

import android.content.Context;
import android.opengl.Matrix;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class eqq {
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object d;

    public eqq() {
        this.d = new float[16];
        this.a = new float[16];
        this.c = new bwn();
    }

    public static void b(float[] fArr, float[] fArr2) {
        int[] iArr = bvo.a;
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }

    public final boolean a() {
        return this.d == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ynz] */
    public final void c(long j) {
        float f;
        wjf wjiVar;
        if (this.b || !((snh) this.a).a(j)) {
            return;
        }
        this.b = true;
        ?? r6 = this.d;
        Object obj = this.c;
        smc smcVar = (smc) obj;
        if (smcVar.c() == null) {
            f = 0.0f;
        } else {
            aose aoseVar = smcVar.c().f().d.C;
            if (aoseVar == null) {
                aoseVar = aose.a;
            }
            f = aoseVar.b;
        }
        if (smcVar.c() != null) {
            wjiVar = smcVar.c();
        } else {
            slb slbVar = (slb) obj;
            if (slbVar.g().isPresent() && slbVar.f().isPresent()) {
                wjiVar = new wji((wja) slbVar.g().get(), (wje) slbVar.f().get(), smcVar.n);
            } else {
                wjiVar = null;
            }
        }
        if (wjiVar == null || f <= 0.0f) {
            return;
        }
        rus rusVar = (rus) r6;
        if (((Boolean) rusVar.b.getAndSet(Boolean.TRUE)).booleanValue()) {
            return;
        }
        ((xsc) rusVar.a.io()).B(wjiVar, 0L, (long) (f * 1000.0f), r6);
    }

    public final boolean d(amkl amklVar, adny adnyVar, String str, akoa akoaVar, akoa akoaVar2, boolean z) {
        int i = amklVar.b;
        boolean z2 = (i & SemanticState.Hidden) == 0 || akoaVar != null;
        boolean z3 = (i & SemanticState.LiveRegion) == 0 || akoaVar2 != null;
        boolean zAa = ahno.aa(str);
        if (this.b) {
            adnyVar.c.setActivated(zAa);
            adnyVar.e.setActivated(!z2);
            adnyVar.f.setActivated(!z3);
        }
        boolean z4 = !zAa && z2 && z3;
        if (z4) {
            adnyVar.b.setImageResource(R.drawable.quantum_ic_send_googblue_24);
        } else {
            adnyVar.b.setImageResource(R.drawable.quantum_ic_send_grey600_24);
            if (z) {
                adnyVar.b.announceForAccessibility(adnyVar.a.e);
                return false;
            }
        }
        return z4;
    }

    public final void e(amkl amklVar, Object obj) {
        agdf agdfVar = agdf.a;
        new adny((Context) this.d, (tza) this.a, amklVar, agdfVar, new adnz(this, amklVar, agdfVar, obj)).show();
    }

    public eqq(Context context, tza tzaVar, vxe vxeVar) {
        this.d = context;
        this.a = tzaVar;
        this.c = vxeVar;
        this.b = false;
    }

    public eqq(anry anryVar) {
        this.d = anryVar;
        this.a = anryVar.e;
        this.c = anryVar.f;
        this.b = anryVar.d;
    }

    public eqq(equ equVar) {
        this.b = false;
        this.a = null;
        this.c = null;
        this.d = equVar;
    }

    public eqq(Object obj, epx epxVar) {
        this.b = false;
        this.a = obj;
        this.c = epxVar;
        this.d = null;
    }

    public eqq(rus rusVar, slb slbVar, snh snhVar) {
        this.d = rusVar;
        this.c = slbVar;
        this.a = snhVar;
        this.b = false;
    }

    public eqq(smr smrVar, snh snhVar, skh skhVar) {
        this.a = smrVar;
        this.c = snhVar;
        this.d = skhVar;
    }
}
