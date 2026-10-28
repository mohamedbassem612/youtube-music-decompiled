package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgo implements adma {
    public final vxe a;
    public final AppCompatSpinner b;
    public final jhm c;
    public final jgn d;
    public int e;
    private final avlh f;
    private final ViewGroup g;
    private avmn h;

    public jgo(Context context, vxe vxeVar, avlh avlhVar, adxj adxjVar) {
        this.a = vxeVar;
        this.f = avlhVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sort_filter_sub_menu, (ViewGroup) null, false);
        this.g = viewGroup;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) viewGroup.findViewById(R.id.spinner);
        this.b = appCompatSpinner;
        jhm jhmVar = new jhm(context, adxjVar.b(arqz.fP));
        this.c = jhmVar;
        appCompatSpinner.setAdapter((SpinnerAdapter) jhmVar);
        appCompatSpinner.setAccessibilityDelegate(new jgm());
        this.d = new jgn(this);
        this.e = -1;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.g;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.c.clear();
        avmn avmnVar = this.h;
        if (avmnVar == null || avmnVar.f()) {
            return;
        }
        awka.f((AtomicReference) this.h);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        int i;
        AppCompatSpinner appCompatSpinner = this.b;
        aqaw aqawVar = (aqaw) obj;
        appCompatSpinner.setOnItemSelectedListener(null);
        jhm jhmVar = this.c;
        jhmVar.clear();
        jhmVar.addAll(aqawVar.c);
        aiie aiieVar = aqawVar.c;
        int i2 = 0;
        while (true) {
            if (i2 >= aiieVar.size()) {
                i2 = 0;
                break;
            } else if (((aqav) aiieVar.get(i2)).f) {
                break;
            } else {
                i2++;
            }
        }
        aiie aiieVar2 = aqawVar.c;
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= aiieVar2.size()) {
                i3 = -1;
                break;
            }
            if (((aqav) aiieVar2.get(i3)).c == 5) {
                aqav aqavVar = (aqav) aiieVar2.get(i3);
                ajwo ajwoVar = aqavVar.c == 5 ? (ajwo) aqavVar.d : ajwo.a;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aotf.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aotf.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    aotf aotfVar = (aotf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    if (aotfVar.e.size() > 0 && (((aote) aotfVar.e.get(0)).b & 1) != 0) {
                        aotd aotdVarA = aotd.a(((aote) aotfVar.e.get(0)).d);
                        if (aotdVarA == null) {
                            aotdVarA = aotd.ACTION_UNKNOWN;
                        }
                        if (aotdVarA == aotd.ACTION_SET_PLAYLIST_VIDEO_ORDER && (((aote) aotfVar.e.get(0)).b & 32768) != 0 && ((aote) aotfVar.e.get(0)).l == 0) {
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }
            i3++;
        }
        this.e = i3;
        appCompatSpinner.setSelection(i2, false);
        jgn jgnVar = this.d;
        jgnVar.a = i2;
        appCompatSpinner.setOnItemSelectedListener(jgnVar);
        avmn avmnVar = this.h;
        if (avmnVar == null || avmnVar.f()) {
            this.h = this.f.p().i(new abwr(i)).al(new iwb(this, 18), new jeh(3));
        }
    }
}
