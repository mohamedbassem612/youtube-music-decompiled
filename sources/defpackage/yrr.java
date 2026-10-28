package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yrr {
    public final Uri a;
    public final String b;
    public final Map c;
    public final AtomicReference d;
    public final Optional e;
    public final aoqd f;
    public final wiu g;
    public String h;
    public boolean i;
    public final Duration j;
    public final boolean k;
    public final Optional l;
    public final Optional m;
    public int n = -1;
    public int o = -1;
    public final Integer p;
    public final arfb q;
    public final boolean r;
    public final String s;
    public final String t;
    public final arie u;
    public final aphs v;
    public final boolean w;
    public int x;

    public yrr(String str, Duration duration, Optional optional, boolean z, Uri uri, aoqd aoqdVar, boolean z2, Optional optional2, Optional optional3, String str2, String str3, Integer num, arfb arfbVar, arie arieVar, aphs aphsVar, boolean z3) {
        typ.f(str);
        this.b = str;
        this.j = duration;
        this.l = optional;
        this.k = z;
        this.a = uri;
        this.f = aoqdVar;
        this.r = z2;
        this.e = optional2;
        this.m = optional3;
        this.s = str2;
        this.t = str3;
        this.x = 5;
        this.g = new wiu(aoqdVar);
        this.p = num;
        this.q = arfbVar;
        this.u = arieVar;
        this.v = aphsVar;
        this.w = z3;
        this.d = new AtomicReference(jrp.ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE);
        HashMap map = new HashMap();
        this.c = map;
        map.put("Content-Type", "application/x-protobuf");
    }

    public static yrr g(vyo vyoVar, Optional optional, String str, Duration duration, zkj zkjVar, byte[] bArr, Integer num, arfb arfbVar, arie arieVar, aphs aphsVar, boolean z, boolean z2) {
        yrq yrqVar;
        yrr yrrVar;
        if (!z && !TextUtils.isEmpty(str)) {
            Optional optionalOfNullable = true != optional.isPresent() ? optional : Optional.ofNullable(((aojt) optional.get()).c);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Boolean.valueOf(!TextUtils.isEmpty((String) optionalOfNullable.get())));
            }
            boolean zBooleanValue = ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
            Optional optionalOfNullable2 = Optional.ofNullable(vyoVar);
            if (true == optionalOfNullable2.isPresent()) {
                optionalOfNullable2 = Optional.ofNullable(((vyo) optionalOfNullable2.get()).b());
            }
            alik alikVar = (alik) optionalOfNullable2.orElse(null);
            if (zBooleanValue || h(alikVar, false)) {
                if (h(alikVar, zBooleanValue)) {
                    yrqVar = alikVar == null ? new yrq() : new yrq(alikVar);
                } else {
                    yrqVar = new yrq((aojt) optional.get());
                }
                yrqVar.a = str;
                if (alikVar != null) {
                    yrqVar.b(alikVar);
                }
                if (zkjVar != null) {
                    yrqVar.e = Optional.of(zkjVar);
                }
                if (arieVar != null) {
                    yrqVar.k = arieVar;
                }
                if (bArr.length > 0) {
                    yrqVar.f = Optional.of(bArr);
                }
                if (num != null) {
                    num.intValue();
                    yrqVar.i = num;
                } else if (arfbVar != null) {
                    yrqVar.j = arfbVar;
                }
                if (aphsVar != null) {
                    yrqVar.l = aphsVar;
                }
                if (duration != null) {
                    yrqVar.b = duration;
                }
                yrqVar.m = z2;
                yrqVar.a.getClass();
                if (yrqVar.d.isPresent() && yrqVar.c.isEmpty()) {
                    alik alikVar2 = (alik) yrqVar.d.get();
                    anew anewVar = alikVar2.j;
                    if (anewVar == null) {
                        anewVar = anew.a;
                    }
                    aojp aojpVar = anewVar.c;
                    if (aojpVar == null) {
                        aojpVar = aojp.a;
                    }
                    ahno.F((aojpVar.b & 2097152) != 0);
                    aihf aihfVarCreateBuilder = aoqd.a.createBuilder();
                    anew anewVar2 = alikVar2.j;
                    if (anewVar2 == null) {
                        anewVar2 = anew.a;
                    }
                    aojp aojpVar2 = anewVar2.c;
                    if (aojpVar2 == null) {
                        aojpVar2 = aojp.a;
                    }
                    Uri uriBuild = Uri.parse(aojpVar2.m).buildUpon().scheme("https").build();
                    anew anewVar3 = alikVar2.j;
                    if (anewVar3 == null) {
                        anewVar3 = anew.a;
                    }
                    ajbv ajbvVar = anewVar3.g;
                    if (ajbvVar == null) {
                        ajbvVar = ajbv.a;
                    }
                    if ((ajbvVar.c & 2) != 0) {
                        anew anewVar4 = alikVar2.j;
                        if (anewVar4 == null) {
                            anewVar4 = anew.a;
                        }
                        ajbv ajbvVar2 = anewVar4.g;
                        if (ajbvVar2 == null) {
                            ajbvVar2 = ajbv.a;
                        }
                        akwm akwmVar = ajbvVar2.v;
                        if (akwmVar == null) {
                            akwmVar = akwm.b;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        aoqd aoqdVar = (aoqd) aihfVarCreateBuilder.instance;
                        akwmVar.getClass();
                        aoqdVar.f = akwmVar;
                        aoqdVar.b |= 2;
                    }
                    anew anewVar5 = alikVar2.j;
                    ajbv ajbvVar3 = (anewVar5 == null ? anew.a : anewVar5).g;
                    if (ajbvVar3 == null) {
                        ajbvVar3 = ajbv.a;
                    }
                    if ((ajbvVar3.c & 4) != 0) {
                        if (anewVar5 == null) {
                            anewVar5 = anew.a;
                        }
                        ajbv ajbvVar4 = anewVar5.g;
                        if (ajbvVar4 == null) {
                            ajbvVar4 = ajbv.a;
                        }
                        aqdd aqddVar = ajbvVar4.w;
                        if (aqddVar == null) {
                            aqddVar = aqdd.a;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        aoqd aoqdVar2 = (aoqd) aihfVarCreateBuilder.instance;
                        aqddVar.getClass();
                        aoqdVar2.z = aqddVar;
                        aoqdVar2.c |= SemanticState.Focused;
                    }
                    anew anewVar6 = alikVar2.j;
                    if (anewVar6 == null) {
                        anewVar6 = anew.a;
                    }
                    aojp aojpVar3 = anewVar6.c;
                    if (aojpVar3 == null) {
                        aojpVar3 = aojp.a;
                    }
                    aojn aojnVar = aojpVar3.g;
                    if (aojnVar == null) {
                        aojnVar = aojn.a;
                    }
                    if ((aojnVar.b & 524288) != 0) {
                        anew anewVar7 = alikVar2.j;
                        if (anewVar7 == null) {
                            anewVar7 = anew.a;
                        }
                        aojp aojpVar4 = anewVar7.c;
                        if (aojpVar4 == null) {
                            aojpVar4 = aojp.a;
                        }
                        aojn aojnVar2 = aojpVar4.g;
                        if (aojnVar2 == null) {
                            aojnVar2 = aojn.a;
                        }
                        akjx akjxVar = aojnVar2.n;
                        if (akjxVar == null) {
                            akjxVar = akjx.b;
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        aoqd aoqdVar3 = (aoqd) aihfVarCreateBuilder.instance;
                        akjxVar.getClass();
                        aoqdVar3.x = akjxVar;
                        aoqdVar3.c |= 32;
                    }
                    yrqVar.a();
                    yrrVar = new yrr(yrqVar.a, yrqVar.b, Optional.empty(), false, uriBuild, (aoqd) aihfVarCreateBuilder.build(), true, yrqVar.e, yrqVar.f, yrqVar.g, yrqVar.h, yrqVar.i, yrqVar.j, yrqVar.k, yrqVar.l, yrqVar.m);
                } else {
                    ahno.F(yrqVar.c.isPresent());
                    aojt aojtVar = (aojt) yrqVar.c.get();
                    ahno.F(1 == (aojtVar.b & 1));
                    aihf aihfVarCreateBuilder2 = aoqd.a.createBuilder();
                    if ((aojtVar.b & 2) != 0) {
                        aojr aojrVar = aojtVar.d;
                        if (aojrVar == null) {
                            aojrVar = aojr.a;
                        }
                        akwm akwmVar2 = aojrVar.b;
                        if (akwmVar2 == null) {
                            akwmVar2 = akwm.b;
                        }
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoqd aoqdVar4 = (aoqd) aihfVarCreateBuilder2.instance;
                        akwmVar2.getClass();
                        aoqdVar4.f = akwmVar2;
                        aoqdVar4.b |= 2;
                    }
                    if ((aojtVar.b & 131072) != 0) {
                        aoju aojuVar = aojtVar.e;
                        if (aojuVar == null) {
                            aojuVar = aoju.a;
                        }
                        aqdd aqddVar2 = aojuVar.b;
                        if (aqddVar2 == null) {
                            aqddVar2 = aqdd.a;
                        }
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoqd aoqdVar5 = (aoqd) aihfVarCreateBuilder2.instance;
                        aqddVar2.getClass();
                        aoqdVar5.z = aqddVar2;
                        aoqdVar5.c |= SemanticState.Focused;
                    }
                    if ((aojtVar.b & 8388608) != 0) {
                        akjx akjxVar2 = aojtVar.f;
                        if (akjxVar2 == null) {
                            akjxVar2 = akjx.b;
                        }
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoqd aoqdVar6 = (aoqd) aihfVarCreateBuilder2.instance;
                        akjxVar2.getClass();
                        aoqdVar6.x = akjxVar2;
                        aoqdVar6.c |= 32;
                    }
                    yrqVar.a();
                    String str2 = yrqVar.a;
                    Duration duration2 = yrqVar.b;
                    aojq aojqVar = aojtVar.g;
                    if (aojqVar == null) {
                        aojqVar = aojq.a;
                    }
                    Optional optionalOf = Optional.of(aojqVar.c);
                    aojq aojqVar2 = aojtVar.g;
                    if (aojqVar2 == null) {
                        aojqVar2 = aojq.a;
                    }
                    yrrVar = new yrr(str2, duration2, optionalOf, aojqVar2.b, Uri.parse(aojtVar.c), (aoqd) aihfVarCreateBuilder2.build(), false, yrqVar.e, yrqVar.f, yrqVar.g, yrqVar.h, yrqVar.i, yrqVar.j, yrqVar.k, yrqVar.l, yrqVar.m);
                }
                return yrrVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    /* JADX WARN: Code duplicated, block: B:24:0x002b  */
    private static boolean h(alik alikVar, boolean z) {
        boolean z2;
        boolean z3;
        if (alikVar == null) {
            z2 = false;
        } else {
            anew anewVar = alikVar.j;
            if (anewVar == null) {
                anewVar = anew.a;
            }
            aojp aojpVar = anewVar.c;
            if (aojpVar == null) {
                aojpVar = aojp.a;
            }
            if (aojpVar.p) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (alikVar == null) {
            z3 = false;
        } else {
            anew anewVar2 = alikVar.j;
            if (anewVar2 == null) {
                anewVar2 = anew.a;
            }
            aojp aojpVar2 = anewVar2.c;
            if (aojpVar2 == null) {
                aojpVar2 = aojp.a;
            }
            if (aojpVar2.q) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z2) {
            return true;
        }
        return !z && z3;
    }

    public final jrp a() {
        return (jrp) this.d.get();
    }

    public final void b(String str) {
        typ.f(str);
        this.h = str;
    }

    public final boolean c() {
        int i = this.x;
        boolean z = i == 5;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final boolean d() {
        int i = this.x;
        boolean z = i == 3;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final boolean e() {
        int i = this.x;
        boolean z = i == 2;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final boolean f() {
        if (this.w) {
            return e() || d();
        }
        return false;
    }
}
