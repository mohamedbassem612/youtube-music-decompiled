package defpackage;

import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xev {
    private static final agrf h = agrf.h("com/google/android/libraries/youtube/logging/event/EventLoggingConfigManager");
    public volatile akwd a;
    public final mbc b;
    public final Map e;
    public final boolean f;
    private final vxz i;
    public final Set c = EnumSet.noneOf(alot.class);
    public final Set d = EnumSet.noneOf(alot.class);
    public volatile Map g = new ConcurrentHashMap();

    public xev(vyo vyoVar, zrs zrsVar, vxz vxzVar, mbc mbcVar) {
        this.b = mbcVar;
        this.i = vxzVar;
        akkk akkkVarC = zrsVar.c();
        if ((akkkVarC.b & SemanticState.LiveRegion) != 0) {
            akko akkoVar = akkkVarC.e;
            this.f = (akkoVar == null ? akko.a : akkoVar).c;
        } else {
            this.f = false;
        }
        this.e = new HashMap();
        this.a = akwd.a;
        a(amuh.a);
        this.a = zrs.h();
        vyoVar.c(new xee(2)).af(new vub(this, 14));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012 A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000d, B:9:0x000f, B:11:0x0018, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:18:0x0040, B:19:0x0071, B:21:0x0075, B:22:0x0078, B:24:0x007c, B:25:0x007f, B:27:0x0087, B:28:0x0089, B:30:0x008d, B:33:0x0096, B:10:0x0012), top: B:41:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000d, B:9:0x000f, B:11:0x0018, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:18:0x0040, B:19:0x0071, B:21:0x0075, B:22:0x0078, B:24:0x007c, B:25:0x007f, B:27:0x0087, B:28:0x0089, B:30:0x008d, B:33:0x0096, B:10:0x0012), top: B:41:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000d, B:9:0x000f, B:11:0x0018, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:18:0x0040, B:19:0x0071, B:21:0x0075, B:22:0x0078, B:24:0x007c, B:25:0x007f, B:27:0x0087, B:28:0x0089, B:30:0x008d, B:33:0x0096, B:10:0x0012), top: B:41:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000d, B:9:0x000f, B:11:0x0018, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:18:0x0040, B:19:0x0071, B:21:0x0075, B:22:0x0078, B:24:0x007c, B:25:0x007f, B:27:0x0087, B:28:0x0089, B:30:0x008d, B:33:0x0096, B:10:0x0012), top: B:41:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[Catch: all -> 0x00a4, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000d, B:9:0x000f, B:11:0x0018, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:18:0x0040, B:19:0x0071, B:21:0x0075, B:22:0x0078, B:24:0x007c, B:25:0x007f, B:27:0x0087, B:28:0x0089, B:30:0x008d, B:33:0x0096, B:10:0x0012), top: B:41:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x002a A[SYNTHETIC] */
    public final synchronized void a(amuh amuhVar) {
        Set set;
        Set set2;
        int i;
        alot alotVarA;
        int i2;
        akku akkuVarA;
        akku akkuVar;
        akku akkuVarA2;
        if (amuhVar != null) {
            if ((amuhVar.b & 1) != 0) {
                akwd akwdVar = amuhVar.c;
                if (akwdVar == null) {
                    akwdVar = akwd.a;
                }
                this.a = akwdVar;
            } else {
                this.a = zrs.h();
            }
            set = this.c;
            set.getClass();
            set2 = this.d;
            set2.getClass();
            for (akwf akwfVar : this.a.d) {
                if (akwfVar == null) {
                    i = akwfVar.c;
                    alotVarA = alot.a(i);
                    if (alotVarA == null) {
                        String strBP = a.bP(i, "payloadCase for payload number ", " is null in onNextEventLoggingConfig");
                        ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/logging/event/EventLoggingConfigManager", "onNextEventLoggingConfig", R.styleable.AppCompatTheme_windowMinWidthMajor, "EventLoggingConfigManager.java")).w("%s", strBP);
                        zvp.a(zvn.b, zvm.m, "GEL_DELAYED_EVENT_DEBUG ".concat(strBP));
                    } else {
                        if (!akwfVar.d) {
                            set.add(alotVarA);
                        }
                        if (akwfVar.e) {
                            set2.add(alotVarA);
                        }
                        i2 = akwfVar.f;
                        akkuVarA = akku.a(i2);
                        if (akkuVarA == null) {
                            akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                        }
                        akkuVar = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                        if (akkuVarA != akkuVar) {
                            Map map = this.e;
                            akkuVarA2 = akku.a(i2);
                            if (akkuVarA2 != null) {
                                akkuVar = akkuVarA2;
                            }
                            map.put(alotVarA, Integer.valueOf(akkuVar.f));
                        }
                    }
                }
            }
        } else {
            this.a = zrs.h();
            set = this.c;
            set.getClass();
            set2 = this.d;
            set2.getClass();
            while (r1.hasNext()) {
                if (akwfVar == null) {
                    i = akwfVar.c;
                    alotVarA = alot.a(i);
                    if (alotVarA == null) {
                        String strBP2 = a.bP(i, "payloadCase for payload number ", " is null in onNextEventLoggingConfig");
                        ((agrc) ((agrc) h.b()).k("com/google/android/libraries/youtube/logging/event/EventLoggingConfigManager", "onNextEventLoggingConfig", R.styleable.AppCompatTheme_windowMinWidthMajor, "EventLoggingConfigManager.java")).w("%s", strBP2);
                        zvp.a(zvn.b, zvm.m, "GEL_DELAYED_EVENT_DEBUG ".concat(strBP2));
                    } else {
                        if (!akwfVar.d) {
                            set.add(alotVarA);
                        }
                        if (akwfVar.e) {
                            set2.add(alotVarA);
                        }
                        i2 = akwfVar.f;
                        akkuVarA = akku.a(i2);
                        if (akkuVarA == null) {
                            akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                        }
                        akkuVar = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                        if (akkuVarA != akkuVar) {
                            Map map2 = this.e;
                            akkuVarA2 = akku.a(i2);
                            if (akkuVarA2 != null) {
                                akkuVar = akkuVarA2;
                            }
                            map2.put(alotVarA, Integer.valueOf(akkuVar.f));
                        }
                    }
                }
            }
        }
        throw th;
    }

    final boolean b(alot alotVar, long j) {
        if (!this.i.l(166, 45743844L, true) || alotVar != null) {
            Long l = (Long) this.g.get(alotVar);
            if (!this.c.contains(alotVar) && (l == null || j >= l.longValue())) {
                return true;
            }
        }
        return false;
    }
}
