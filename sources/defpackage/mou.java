package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mou implements fpo {
    public final int a;
    public final int b;
    public int c = Alert.DURATION_SHOW_INDEFINITELY;
    public int d = 1;
    private final fpg e;
    private FlowLayoutManager f;
    private float g;
    private float h;
    private int i;
    private moo j;
    private String k;
    private mlf l;

    public mou(int i, int i2, float f, float f2, int i3, String str, mlf mlfVar, fpg fpgVar, moo mooVar) {
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = -1;
        this.j = moo.a;
        this.k = null;
        this.l = null;
        if (i == 1 && i2 != Integer.MIN_VALUE && i2 != -1) {
            throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
        }
        this.a = i;
        this.b = i2;
        this.h = f;
        this.g = f2;
        this.i = i3;
        this.k = str;
        this.l = mlfVar;
        this.e = fpgVar == null ? mot.a : fpgVar;
        this.j = mooVar;
    }

    @Override // defpackage.fpo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.fpo
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fpo
    public final oq c() {
        return gzj.aK(this.b, this.c, this.d);
    }

    @Override // defpackage.fpo
    public final fpg d() {
        return this.e;
    }

    @Override // defpackage.fpo
    public final frj e(fhd fhdVar) {
        mlf mlfVar;
        mqt mqtVarA;
        if (this.f == null) {
            mok mokVar = new mok(fhdVar.a);
            mokVar.b = this.a;
            mokVar.c = this.h;
            mokVar.d = this.g;
            mokVar.e = this.i;
            moo mooVar = this.j;
            if (mooVar == null) {
                mooVar = moo.a;
            }
            mokVar.f = mooVar;
            this.f = new FlowLayoutManager(mokVar);
        }
        mos mosVar = new mos(this.f, null);
        String str = this.k;
        if (str != null && (mlfVar = this.l) != null && (mqtVarA = mlfVar.a(str)) != null) {
            aihl aihlVar = mqs.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            mqtVarA.c(aihlVarCheckIsLite);
            if (mqtVarA.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                mqtVarA.c(aihlVarCheckIsLite2);
                Object objK = mqtVarA.j.k(aihlVarCheckIsLite2.d);
                mqs mqsVar = (mqs) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                mosVar.l(mqsVar.d, mqsVar.e);
            }
        }
        return mosVar;
    }
}
