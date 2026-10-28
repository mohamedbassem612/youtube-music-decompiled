package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rmm implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rmm(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional optionalEmpty;
        switch (this.$cid) {
            case 0:
                zwa zwaVar = (zwa) obj;
                zwaVar.getClass();
                return rmp.b(zwaVar);
            case 1:
                String strA = qph.a((String) obj, null);
                return strA == null ? "" : strA;
            case 2:
                return tld.i(obj);
            case 3:
                File file = (File) obj;
                aihf aihfVarCreateBuilder = ajfe.a.createBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file, "cpufreq/cpuinfo_max_freq")));
                    try {
                        String line = bufferedReader.readLine();
                        line.getClass();
                        int i = Integer.parseInt(line);
                        aihfVarCreateBuilder.copyOnWrite();
                        ajfe ajfeVar = (ajfe) aihfVarCreateBuilder.instance;
                        ajfeVar.b |= 1;
                        ajfeVar.c = i;
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                }
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(file, "cpufreq/scaling_cur_freq")));
                    try {
                        String line2 = bufferedReader2.readLine();
                        line2.getClass();
                        int i2 = Integer.parseInt(line2);
                        aihfVarCreateBuilder.copyOnWrite();
                        ajfe ajfeVar2 = (ajfe) aihfVarCreateBuilder.instance;
                        ajfeVar2.b |= 2;
                        ajfeVar2.d = i2;
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                        try {
                            bufferedReader2.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Exception unused2) {
                }
                int i3 = ((ajfe) aihfVarCreateBuilder.instance).b;
                return ((i3 & 1) == 0 && (i3 & 2) == 0) ? Stream.CC.empty() : Stream.CC.of((ajfe) aihfVarCreateBuilder.build());
            case 4:
                int i4 = tdl.b;
                return new HashSet();
            case 5:
                return Boolean.valueOf(((View) obj).hasWindowFocus());
            case 6:
                return ((oho) obj).c;
            case 7:
                return ((oho) obj).d;
            case 8:
                return Integer.valueOf(wfs.a((akve) obj));
            case 9:
                almg almgVar = (almg) obj;
                return new aftj(almgVar.b == 58174010 ? (aqjj) almgVar.c : aqjj.a);
            case 10:
                apos aposVar = (apos) obj;
                int i5 = aposVar.b;
                if ((i5 & 1) != 0) {
                    aobx aobxVar = aposVar.c;
                    if (aobxVar == null) {
                        aobxVar = aobx.a;
                    }
                    optionalEmpty = Optional.of(aawb.ae(aobxVar));
                } else if ((i5 & 2) != 0) {
                    aoyh aoyhVar = aposVar.d;
                    if (aoyhVar == null) {
                        aoyhVar = aoyh.a;
                    }
                    optionalEmpty = Optional.of(aawb.ae(aoyhVar));
                } else if ((i5 & 4) != 0) {
                    apho aphoVar = aposVar.e;
                    if (aphoVar == null) {
                        aphoVar = apho.a;
                    }
                    optionalEmpty = Optional.of(aawb.ae(aphoVar));
                } else if ((i5 & SemanticState.Hidden) != 0) {
                    aqpx aqpxVar = aposVar.i;
                    if (aqpxVar == null) {
                        aqpxVar = aqpx.a;
                    }
                    optionalEmpty = Optional.of(aawb.ae(aqpxVar));
                } else if ((i5 & 16) != 0) {
                    aqmx aqmxVar = aposVar.g;
                    if (aqmxVar == null) {
                        aqmxVar = aqmx.a;
                    }
                    optionalEmpty = Optional.of(aawb.ae(aqmxVar));
                } else if ((i5 & 8) != 0) {
                    amfj amfjVar = aposVar.f;
                    if (amfjVar == null) {
                        amfjVar = amfj.a;
                    }
                    optionalEmpty = Optional.of(aawb.ae(amfjVar));
                } else if ((i5 & SemanticState.Focused) != 0) {
                    apoi apoiVar = aposVar.h;
                    if (apoiVar == null) {
                        apoiVar = apoi.a;
                    }
                    optionalEmpty = Optional.of(aawb.ae(apoiVar));
                } else if ((i5 & SemanticState.LiveRegion) != 0) {
                    ajla ajlaVar = aposVar.j;
                    if (ajlaVar == null) {
                        ajlaVar = ajla.a;
                    }
                    optionalEmpty = Optional.of(aawb.ae(ajlaVar));
                } else {
                    optionalEmpty = Optional.empty();
                }
                return optionalEmpty.stream();
            case 11:
                return wgd.c((apox) obj).stream();
            case 12:
                return ((ajtm) obj).b;
            case 13:
                ajtk ajtkVarA = ajtk.a(((ajtm) obj).c);
                return ajtkVarA == null ? ajtk.CLEARCUT_LOG_ACTION_UNKNOWN : ajtkVarA;
            case 14:
                return xgo.b((argn) obj);
            case 15:
                return ((akjb) obj).b;
            case 16:
                return ajuf.a(((Integer) obj).intValue());
            case 17:
                return Float.valueOf(((akvx) obj).e);
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                int i6 = xnp.h;
                Map map = (Map) Collection.EL.stream(DesugarCollections.unmodifiableMap(((atoy) entry.getValue()).e).entrySet()).sorted(new rit(6)).limit(1000L).collect(aghu.a(new ygi(15), new ygi(16)));
                String str = (String) entry.getKey();
                aihf builder = ((atoy) entry.getValue()).toBuilder();
                builder.copyOnWrite();
                ((atoy) builder.instance).a().clear();
                builder.copyOnWrite();
                ((atoy) builder.instance).a().putAll(map);
                return new AbstractMap.SimpleEntry(str, (atoy) builder.build());
            case 19:
                return (String) ((AbstractMap.SimpleEntry) obj).getKey();
            default:
                return (atoy) ((AbstractMap.SimpleEntry) obj).getValue();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
