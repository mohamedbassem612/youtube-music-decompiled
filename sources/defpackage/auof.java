package defpackage;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class auof implements auph {
    protected final Activity a;
    private volatile Object b;
    private final Object c;
    private final auph d;
    private auor e;
    private final auot f;
    private final auph g;
    private auor h;

    /* JADX WARN: Multi-variable type inference failed */
    public auof(Activity activity) {
        this(activity, new auoj((qe) activity), new auox(activity, activity), new auot(activity, new aunr(activity, null, null)));
    }

    protected Object a() {
        Activity activity = this.a;
        if (!(activity.getApplication() instanceof auph)) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(Application.class.equals(activity.getApplication().getClass()) ? "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?" : "Found: ".concat(String.valueOf(String.valueOf(activity.getApplication().getClass())))));
        }
        ahto ahtoVarC = ((auoe) atqp.a(this.d, auoe.class)).c();
        ahtoVarC.c = activity;
        return new ghj((ght) ahtoVarC.b, (gjw) ahtoVarC.a, (Activity) ahtoVarC.c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aunt, java.lang.Object] */
    public final aunt b() {
        return this.d.generatedComponent();
    }

    public final aunv c() {
        return (aunv) this.g.generatedComponent();
    }

    public final void d() {
        auor auorVar = this.e;
        if (auorVar != null) {
            auorVar.a();
        }
        auor auorVar2 = this.h;
        if (auorVar2 != null) {
            auorVar2.a();
        }
    }

    public final void e() {
        auoj auojVar = (auoj) this.d;
        auor auorVar = ((auoh) new bpn(auojVar.a, new auoa(auojVar.b, 2)).a(auoh.class)).b;
        this.e = auorVar;
        if (auorVar.c()) {
            this.e.b(((qe) this.a).getDefaultViewModelCreationExtras());
        }
        auox auoxVar = (auox) this.g;
        auor auorVar2 = ((auov) new bpn(auoxVar.a, new auoa(auoxVar.b, 4)).a(auov.class)).b;
        this.h = auorVar2;
        if (auorVar2.c()) {
            this.h.b(((qe) this.a).getDefaultViewModelCreationExtras());
        }
    }

    public final gkd f() {
        return this.f.generatedComponent();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = a();
                }
            }
        }
        return this.b;
    }

    public auof(Activity activity, auph auphVar, auph auphVar2, auot auotVar) {
        this.c = new Object();
        this.a = activity;
        this.d = auphVar;
        this.g = auphVar2;
        this.f = auotVar;
    }
}
