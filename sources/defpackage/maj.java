package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class maj implements map {
    private final kii c;
    private final Context d;
    private AtomicBoolean e;
    private final boolean f;
    private final lpo g;
    private static final Set b = atqq.aS(new String[]{"com.google.android.deskclock", "com.google.android.libraries.androidatgoogle.unbrandeddemo", "com.google.android.settings.intelligence"});
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public maj(Context context, Integer num) {
        kii kiiVarH;
        if (num != null) {
            final int iIntValue = num.intValue();
            kif kifVarF = kii.f(context.getApplicationContext(), "ANDROID_AT_GOOGLE");
            kifVarF.f = new kio() { // from class: mah
                @Override // defpackage.kio
                public final kiq a() {
                    ConcurrentHashMap concurrentHashMap = maj.a;
                    return kiq.a(iIntValue, 4);
                }
            };
            kiiVarH = kifVarF.b();
        } else {
            kiiVarH = kii.h(context.getApplicationContext(), "ANDROID_AT_GOOGLE");
        }
        lpo lpoVarA = lps.a(context.getApplicationContext());
        this.c = kiiVarH;
        this.g = lpoVarA;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.d = applicationContext;
        boolean z = true;
        this.e = new AtomicBoolean(true);
        Set<String> set = b;
        if ((set instanceof Collection) && set.isEmpty()) {
            z = false;
        } else {
            for (String str : set) {
                String packageName = this.d.getPackageName();
                packageName.getClass();
                if (awrc.u(packageName, str, true)) {
                }
            }
            z = false;
        }
        this.f = z;
    }

    public static final void b(maj majVar, ainv ainvVar) {
        aihf aihfVarCreateBuilder = aint.a.createBuilder();
        String packageName = majVar.d.getPackageName();
        aihfVarCreateBuilder.copyOnWrite();
        aint aintVar = (aint) aihfVarCreateBuilder.instance;
        packageName.getClass();
        aintVar.b |= 1;
        aintVar.e = packageName;
        aihfVarCreateBuilder.copyOnWrite();
        aint aintVar2 = (aint) aihfVarCreateBuilder.instance;
        aintVar2.d = ainvVar;
        aintVar2.c = 2;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        majVar.c.g((aint) aihnVarBuild).e();
    }

    @Override // defpackage.map
    public final void a(ainv ainvVar) {
        ainvVar.getClass();
        if (this.e.get()) {
            if (!this.f) {
                b(this, ainvVar);
                return;
            }
            lpa lpaVarA = this.g.a();
            lpaVarA.q(new kbf(new apm(ainvVar, this, 19), 6));
            lpaVarA.p(new mag(0));
        }
    }
}
