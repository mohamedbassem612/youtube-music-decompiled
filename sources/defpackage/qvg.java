package defpackage;

import android.graphics.Color;
import com.google.research.xeno.effect.Control;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qvg extends qvc {
    public qvf a;
    public int b;
    private final float h;

    private qvg(qvg qvgVar) {
        super(qvgVar);
        this.a = qvf.b;
        this.b = -1;
        this.h = 0.0f;
        this.a = qvgVar.a;
        this.b = qvgVar.b;
    }

    @Override // defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvc clone() {
        return new qvg(this);
    }

    @Override // defpackage.qvc
    public final String c() {
        return "Mask";
    }

    @Override // defpackage.qvc
    public final /* synthetic */ Object clone() {
        return new qvg(this);
    }

    @Override // defpackage.qvc
    public final void d(qvk qvkVar) {
        Optional optionalOfNullable = Optional.ofNullable((Control) qvkVar.a.b.get("options"));
        jfn jfnVar = new jfn(this, 12);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            Object obj2 = jfnVar.a;
            Control.RuntimeOptionsSetting runtimeOptionsSetting = ((Control) obj).d;
            aihh aihhVar = (aihh) atwa.a.createBuilder();
            aihl aihlVar = aube.b;
            aihf aihfVarCreateBuilder = aube.a.createBuilder();
            qvg qvgVar = (qvg) obj2;
            int i = qvgVar.a.ordinal() != 1 ? 2 : 3;
            aihfVarCreateBuilder.copyOnWrite();
            aube aubeVar = (aube) aihfVarCreateBuilder.instance;
            aubeVar.d = i - 2;
            aubeVar.c |= 1;
            int i2 = qvgVar.b;
            aihf aihfVarCreateBuilder2 = atyv.a.createBuilder();
            float fRed = Color.red(i2);
            aihfVarCreateBuilder2.copyOnWrite();
            ((atyv) aihfVarCreateBuilder2.instance).c = fRed / 255.0f;
            float fGreen = Color.green(i2);
            aihfVarCreateBuilder2.copyOnWrite();
            ((atyv) aihfVarCreateBuilder2.instance).d = fGreen / 255.0f;
            float fBlue = Color.blue(i2);
            aihfVarCreateBuilder2.copyOnWrite();
            ((atyv) aihfVarCreateBuilder2.instance).e = fBlue / 255.0f;
            int iAlpha = Color.alpha(i2);
            if (iAlpha != 255) {
                aihf aihfVarCreateBuilder3 = aihd.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                ((aihd) aihfVarCreateBuilder3.instance).b = iAlpha / 255.0f;
                aihfVarCreateBuilder2.copyOnWrite();
                atyv atyvVar = (atyv) aihfVarCreateBuilder2.instance;
                aihd aihdVar = (aihd) aihfVarCreateBuilder3.build();
                aihdVar.getClass();
                atyvVar.f = aihdVar;
                atyvVar.b |= 1;
            }
            atyv atyvVar2 = (atyv) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            aube aubeVar2 = (aube) aihfVarCreateBuilder.instance;
            atyvVar2.getClass();
            aubeVar2.f = atyvVar2;
            aubeVar2.c |= 4;
            aihfVarCreateBuilder.copyOnWrite();
            aube aubeVar3 = (aube) aihfVarCreateBuilder.instance;
            aubeVar3.c |= 2;
            aubeVar3.e = 0.0f;
            aihhVar.e(aihlVar, (aube) aihfVarCreateBuilder.build());
            runtimeOptionsSetting.a((atwa) aihhVar.build());
        }
    }

    @Override // defpackage.qvc
    public final boolean e(Object obj) {
        if (!(obj instanceof qvg)) {
            return false;
        }
        qvg qvgVar = (qvg) obj;
        if (!super.e(qvgVar) || !Objects.equals(this.a, qvgVar.a) || this.b != qvgVar.b) {
            return false;
        }
        float f = qvgVar.h;
        return nrb.d(0.0d, 0.0d);
    }

    @Override // defpackage.qvc
    public final Object iv() {
        return agke.t(qvg.class, this.a, Integer.valueOf(this.b), Float.valueOf(0.0f));
    }

    @Override // defpackage.qvc
    public final String toString() {
        return String.format(Locale.US, "MaskEffect{%s, maskType=%s, borderColor=%d, borderWidth=%f}", super.toString(), this.a.name(), Integer.valueOf(this.b), Float.valueOf(0.0f));
    }

    private qvg() {
        this.a = qvf.b;
        this.b = -1;
        this.h = 0.0f;
    }
}
