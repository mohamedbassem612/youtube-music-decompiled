package defpackage;

import com.google.research.xeno.effect.Control;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvj extends qvc {
    public static final /* synthetic */ int a = 0;
    private final Map b;

    private qvj(qvj qvjVar) {
        super(qvjVar);
        HashMap map = new HashMap();
        this.b = map;
        map.putAll(qvjVar.b);
    }

    @Override // defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvc clone() {
        return new qvj(this);
    }

    @Override // defpackage.qvc
    public final String c() {
        return "visual_adjustment_effect";
    }

    @Override // defpackage.qvc
    public final /* synthetic */ Object clone() {
        return new qvj(this);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // defpackage.qvc
    public final void d(qvk qvkVar) {
        Map map = qvkVar.a.b;
        for (Map.Entry entry : this.b.entrySet()) {
            Optional optionalOfNullable = Optional.ofNullable((Control) map.get(entry.getKey()));
            jfn jfnVar = new jfn(entry, 13);
            if (true == optionalOfNullable.isPresent()) {
                ((Control) optionalOfNullable.get()).a.a(((Float) jfnVar.a.getValue()).floatValue());
            }
        }
    }

    @Override // defpackage.qvc
    public final boolean e(Object obj) {
        if (!super.e(obj) || !(obj instanceof qvj)) {
            return false;
        }
        qvj qvjVar = (qvj) obj;
        return nrb.d(k(), qvjVar.k()) && nrb.d(l(), qvjVar.l()) && nrb.d(m(), qvjVar.m()) && nrb.d(o(), qvjVar.o()) && nrb.d(w(), qvjVar.w()) && nrb.d(i(), qvjVar.i()) && nrb.d(n(), qvjVar.n()) && nrb.d(v(), qvjVar.v()) && nrb.d(r(), qvjVar.r()) && nrb.d(q(), qvjVar.q()) && nrb.d(j(), qvjVar.j()) && nrb.d(p(), qvjVar.p()) && nrb.d(u(), qvjVar.u()) && nrb.d(s(), qvjVar.s()) && nrb.d(t(), qvjVar.t());
    }

    public final double i() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "blackpoint", Float.valueOf(0.0f))).floatValue();
    }

    @Override // defpackage.qvc
    public final Object iv() {
        return agke.r(qvj.class, this.b);
    }

    public final double j() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "deepbluesat", Float.valueOf(0.0f))).floatValue();
    }

    public final double k() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "exposure", Float.valueOf(0.0f))).floatValue();
    }

    public final double l() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "contrast", Float.valueOf(0.0f))).floatValue();
    }

    public final double m() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "highlights", Float.valueOf(0.0f))).floatValue();
    }

    public final double n() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "saturation", Float.valueOf(0.0f))).floatValue();
    }

    public final double o() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "shadows", Float.valueOf(0.0f))).floatValue();
    }

    public final double p() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "sharpen", Float.valueOf(0.0f))).floatValue();
    }

    public final double q() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "skintonesat", Float.valueOf(0.0f))).floatValue();
    }

    public final double r() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "tint", Float.valueOf(0.0f))).floatValue();
    }

    public final double s() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "vignette_center_x", Float.valueOf(0.0f))).floatValue();
    }

    public final double t() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "vignette_center_y", Float.valueOf(0.0f))).floatValue();
    }

    @Override // defpackage.qvc
    public final String toString() {
        return String.format(Locale.US, "VisualAdjustmentsEffect{%s, floatControls=%s}", super.toString(), this.b);
    }

    public final double u() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "vignette_strength", Float.valueOf(0.0f))).floatValue();
    }

    public final double v() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "temp", Float.valueOf(0.0f))).floatValue();
    }

    public final double w() {
        return ((Float) j$.util.Map.EL.getOrDefault(this.b, "whitepoint", Float.valueOf(0.0f))).floatValue();
    }

    private qvj() {
        this.b = new HashMap();
    }
}
