package defpackage;

import com.google.research.xeno.effect.Control;
import j$.util.Optional;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qva extends qvc {
    public float a;
    public atsq b;

    private qva(qva qvaVar) {
        super(qvaVar);
        this.a = 0.0f;
        this.b = atsq.a;
        this.a = 0.0f;
        this.b = qvaVar.b;
    }

    @Override // defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvc clone() {
        return new qva(this);
    }

    @Override // defpackage.qvc
    public final String c() {
        return "chroma_key_effect";
    }

    @Override // defpackage.qvc
    public final /* synthetic */ Object clone() {
        return new qva(this);
    }

    @Override // defpackage.qvc
    public final void d(qvk qvkVar) {
        Map map = qvkVar.a.b;
        Optional optionalOfNullable = Optional.ofNullable((Control) map.get("intensity"));
        if (true == optionalOfNullable.isPresent()) {
            ((Control) optionalOfNullable.get()).a.a(0.0f);
        }
        Optional optionalOfNullable2 = Optional.ofNullable((Control) map.get("key_color"));
        jfn jfnVar = new jfn(this, 11);
        if (true == optionalOfNullable2.isPresent()) {
            Object obj = optionalOfNullable2.get();
            Object obj2 = jfnVar.a;
            Control.nativeSetColorValue(((Control) obj).e.a, ((qva) obj2).b.toByteArray());
        }
    }

    @Override // defpackage.qvc
    public final boolean e(Object obj) {
        if (!super.e(obj) || !(obj instanceof qva)) {
            return false;
        }
        qva qvaVar = (qva) obj;
        float f = qvaVar.a;
        return nrb.d(0.0d, 0.0d) && this.b.equals(qvaVar.b);
    }

    @Override // defpackage.qvc
    public final Object iv() {
        return agke.s(qva.class, Float.valueOf(0.0f), this.b);
    }

    @Override // defpackage.qvc
    public final String toString() {
        return String.format(Locale.US, "ChromaKeyEffect{%s, intensity=%f, keyColor=[%s,%s,%s,%s]}", super.toString(), Float.valueOf(0.0f), Double.valueOf(this.b.c), Double.valueOf(this.b.d), Double.valueOf(this.b.e), Double.valueOf(this.b.f));
    }

    private qva() {
        this.a = 0.0f;
        this.b = atsq.a;
    }
}
