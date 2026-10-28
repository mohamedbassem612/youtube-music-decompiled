package defpackage;

import com.google.research.xeno.effect.Control;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvd extends qvc {
    public qve a;
    private float b;

    private qvd(qvd qvdVar) {
        super(qvdVar);
        this.b = 1.0f;
        this.a = null;
        this.b = qvdVar.b;
    }

    @Override // defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvc clone() {
        return new qvd(this);
    }

    @Override // defpackage.qvc
    public final String c() {
        throw null;
    }

    @Override // defpackage.qvc
    public final /* synthetic */ Object clone() {
        return new qvd(this);
    }

    @Override // defpackage.qvc
    public final void d(qvk qvkVar) {
        Control control = (Control) qvkVar.a.b.get("strength");
        control.getClass();
        control.a.a(this.b);
    }

    @Override // defpackage.qvc
    public final boolean e(Object obj) {
        if (!super.e(obj) || !(obj instanceof qvd)) {
            return false;
        }
        qve qveVar = ((qvd) obj).a;
        throw null;
    }

    public final double i() {
        return this.b;
    }

    @Override // defpackage.qvc
    public final Object iv() {
        return agke.s(qvd.class, null, Float.valueOf(this.b));
    }

    @Override // defpackage.qvc
    public final String toString() {
        return String.format(Locale.US, "LutEffect{%s, lutEffectType=%s, lutStrength=%f}", super.toString(), null, Float.valueOf(this.b));
    }

    private qvd() {
        this.b = 1.0f;
    }
}
