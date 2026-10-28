package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jbg implements adma {
    protected final Context a;
    protected final admd b;
    protected final izf c;
    public final TextView d;
    public final ImageView e;
    public boolean f;
    public Spanned g;
    public Spanned h;
    public int i;
    public int j;
    public String k;
    public String l;

    protected jbg(Context context, izf izfVar, int i) {
        context.getClass();
        this.a = context;
        izfVar.getClass();
        this.c = izfVar;
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.d = (TextView) viewInflate.findViewById(R.id.expand_button_text);
        this.e = (ImageView) viewInflate.findViewById(R.id.expand_button_icon);
        this.f = false;
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.b).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.b.d(null);
        this.f = false;
    }

    public abstract void d();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.adma
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, hee heeVar) {
        akwo akwoVar = (akwo) heeVar.a;
        adlyVar.b.w(new xgj(akwoVar.g, (amud) null), null);
        admd admdVar = this.b;
        admdVar.d(heeVar.b);
        alay alayVar = akwoVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        this.g = ackj.k(null, alayVar, null, false);
        alay alayVar2 = akwoVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        this.h = ackj.k(null, alayVar2, null, false);
        if ((akwoVar.b & 4) != 0) {
            alja aljaVar = akwoVar.e;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            izf izfVar = this.c;
            this.i = izfVar.a(alizVarA);
            int iB = izfVar.b(alizVarA);
            Context context = this.a;
            if (iB != 0) {
                this.k = context.getString(iB);
            } else {
                this.k = context.getString(R.string.accessibility_expand_content);
            }
        } else {
            this.i = this.c.a(aliz.EXPAND);
            this.k = this.a.getString(R.string.accessibility_expand_content);
        }
        if ((akwoVar.b & 8) != 0) {
            alja aljaVar2 = akwoVar.f;
            if (aljaVar2 == null) {
                aljaVar2 = alja.a;
            }
            aliz alizVarA2 = aliz.a(aljaVar2.c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            izf izfVar2 = this.c;
            this.j = izfVar2.a(alizVarA2);
            int iB2 = izfVar2.b(alizVarA2);
            Context context2 = this.a;
            if (iB2 != 0) {
                this.l = context2.getString(iB2);
            } else {
                this.l = context2.getString(R.string.accessibility_collapse_content);
            }
        } else {
            this.j = this.c.a(aliz.COLLAPSE);
            this.l = this.a.getString(R.string.accessibility_collapse_content);
        }
        d();
        admdVar.e(adlyVar);
    }
}
