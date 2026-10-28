package defpackage;

import android.net.Uri;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class qvi extends qvc {
    public final qwx a;

    protected qvi(qvi qviVar) {
        super(qviVar);
        this.a = new qwx(qviVar.a);
    }

    @Override // defpackage.qvc
    public final String c() {
        return "skottie_effect_".concat(this.a.c);
    }

    @Override // defpackage.qvc
    public final boolean e(Object obj) {
        if (!super.e(obj) || !(obj instanceof qvi)) {
            return false;
        }
        qwx qwxVar = this.a;
        qwx qwxVar2 = ((qvi) obj).a;
        return (qwxVar2 instanceof qwx) && qwxVar.d.equals(qwxVar2.d) && qwxVar.c.equals(qwxVar2.c);
    }

    public final Uri i() {
        return this.a.d;
    }

    @Override // defpackage.qvc
    public final Object iv() {
        return agke.r(qvi.class, this.a.d);
    }

    @Override // defpackage.qvc
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public qvi clone() {
        return new qvi(this);
    }

    @Override // defpackage.qvc
    public final String toString() {
        return String.format(Locale.US, "SkottieEffect{%s, skottieSource=%s}", super.toString(), this.a);
    }

    public qvi(qwx qwxVar) {
        this.a = qwxVar;
    }

    protected qvi(UUID uuid, qwx qwxVar) {
        super(uuid);
        this.a = qwxVar;
    }
}
