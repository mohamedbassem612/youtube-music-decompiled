package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeko extends adsv implements aeks, aemu {
    private final Context a;
    private final adhv b;
    private final admu c;
    private final vxe d;
    private final aduv e;
    private final SharedPreferences f;
    private final List g;
    private final alay h;

    public aeko(aqsl aqslVar, Context context, adhv adhvVar, vxe vxeVar, aduv aduvVar, SharedPreferences sharedPreferences) {
        this.a = context;
        this.b = adhvVar;
        this.d = vxeVar;
        this.e = aduvVar;
        this.f = sharedPreferences;
        admu admuVar = new admu();
        this.c = admuVar;
        this.g = new ArrayList();
        alay alayVar = null;
        if (System.currentTimeMillis() - sharedPreferences.getLong("share_panel_promo_last_dismissed_millis", 0L) > aqslVar.g) {
            admuVar.add(aqslVar);
            this.h = null;
        } else {
            if ((aqslVar.b & 8) != 0 && (alayVar = aqslVar.f) == null) {
                alayVar = alay.a;
            }
            this.h = alayVar;
        }
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.c;
    }

    @Override // defpackage.aeks
    public final void b(List list) {
        for (Object obj : list) {
            if (obj != this && (obj instanceof aemu)) {
                this.g.add((aemu) obj);
            }
        }
        alay alayVar = this.h;
        if (alayVar != null) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((aemu) it.next()).e(alayVar);
            }
        }
    }

    @Override // defpackage.aeks
    public final void c(admh admhVar) {
        admhVar.d(aqsl.class, new aemt(this.a, this.b, this.d, this.e, this));
    }

    @Override // defpackage.aemu
    public final void e(alay alayVar) {
        this.c.clear();
        this.f.edit().putLong("share_panel_promo_last_dismissed_millis", System.currentTimeMillis()).apply();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((aemu) it.next()).e(alayVar);
        }
    }
}
