package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cbq implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ cbq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        Object cbgVar;
        switch (this.$cid) {
            case 0:
                int i = cbt.a;
                cbgVar = new cbg((Context) this.a);
                break;
            case 1:
                int i2 = cbt.a;
                return this.a;
            case 2:
                int i3 = cbt.a;
                cbgVar = new cmy(new byj((Context) this.a), new cve());
                break;
            case 3:
                int i4 = cbt.a;
                return this.a;
            case 4:
                int i5 = cbt.a;
                cbgVar = new cqr((Context) this.a);
                break;
            case 5:
                int i6 = cbt.a;
                return crg.i((Context) this.a);
            case 6:
                int i7 = cbt.a;
                cbgVar = new cbg((Context) this.a);
                break;
            case 7:
                int i8 = cbt.a;
                return this.a;
            case 8:
                int i9 = cbt.a;
                return this.a;
            case 9:
                try {
                    return (cnl) ((Class) this.a).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 10:
                return (ost) ((jnm) this.a).d.io();
            case 11:
                return (ElementsServices) ((gms) this.a).r.io();
            case 12:
                gms gmsVar = (gms) this.a;
                return ((abxu) gmsVar.s.io()).p(gmsVar.g);
            case 13:
                grf grfVar = (grf) this.a;
                return ((abxu) grfVar.aj.io()).p(grfVar.e);
            case 14:
                return (agbo) ((Container) this.a.io()).a(new afyq(13));
            case 15:
                return this.a.getString("flag_configuration", "{}");
            case 16:
                return this.a.getString("app_settings_json", "{}");
            case 17:
                cbgVar = new kjc((Context) this.a, (byte[]) null);
                break;
            case 18:
                khn khnVar = kxd.a;
                cbgVar = new kxs((Activity) this.a);
                break;
            case 19:
                return Integer.valueOf(mqq.a((CommandOuterClass$Command) this.a));
            default:
                int i10 = mrl.p;
                return this.a;
        }
        return cbgVar;
    }
}
