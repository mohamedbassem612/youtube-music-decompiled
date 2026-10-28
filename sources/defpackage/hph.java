package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableAudioFormat;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableVideoFormat;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hph implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hph(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v57, types: [axo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [axo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v54, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v83, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v90, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v96, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v98, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v17, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v21, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, zwa] */
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
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        abaa abaaVar;
        int i = 8;
        int i2 = 0;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                final hpk hpkVar = (hpk) this.a;
                ListenableFuture listenableFutureG = hpkVar.d.g((String) obj);
                hpu hpuVar = (hpu) this.b;
                final boolean z = hpuVar.d;
                final boolean z2 = hpuVar.e;
                return ahno.as(listenableFutureG, new ahcy() { // from class: hpe
                    @Override // defpackage.ahcy
                    public final ListenableFuture a(Object obj2) {
                        final boolean z3 = z;
                        final boolean z4 = z2;
                        agke agkeVar = (agke) obj2;
                        if (z3) {
                            if (z4) {
                                return ahng.n(agke.n(agkeVar));
                            }
                        } else if (!z4) {
                            return ahng.n(agpi.a);
                        }
                        return ahno.ar(hpkVar.d.b.b(agkeVar), new agek() { // from class: hoz
                            @Override // defpackage.agek
                            public final Object apply(Object obj3) {
                                aigj aigjVar = hpb.a;
                                return (agke) Collection.EL.stream((List) obj3).filter(new hod(4)).map(new hnv(14)).filter(new vka(z3, z4, 1)).map(new hnv(15)).collect(aghu.a);
                            }
                        }, MoreExecutors.directExecutor());
                    }
                }, MoreExecutors.directExecutor());
            case 1:
                List listSubList = this.b.subList(0, ((List) obj).size());
                int i4 = 0;
                for (int i5 = 0; i5 < listSubList.size(); i5++) {
                    i4 += ((cim) listSubList.get(i5)).d;
                }
                int iNextInt = ((Random) ((aepb) this.a).b).nextInt(i4);
                int i6 = 0;
                while (i2 < listSubList.size()) {
                    cim cimVar = (cim) listSubList.get(i2);
                    i6 += cimVar.d;
                    if (iNextInt < i6) {
                        return cimVar;
                    }
                    i2++;
                }
                return (cim) aguu.K(listSubList);
            case 2:
                Optional optional = (Optional) obj;
                hqb hqbVar = new hqb(this.a, this.b, i3);
                if (true != optional.isPresent()) {
                    return optional;
                }
                return Optional.ofNullable(((tzk) optional.get()).I(((hps) hqbVar.a).a.b(hqbVar.b)));
            case 3:
                aofh aofhVar = (aofh) obj;
                String strH = wfs.h(aofhVar.d);
                if (!strH.isEmpty()) {
                    return ((hsj) this.a).f(this.b, strH, aofhVar);
                }
                aano aanoVar = new aano(aanp.c);
                aanoVar.d = 27;
                return ahng.n(aanoVar.a());
            case 4:
                return ((hsu) this.a).c.m(((aamo) obj).d(), "PPOM", ((anue) this.b).k, aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE, 6);
            case 5:
                abaaVar = new abaa((may) this.a, (abvn) this.b.io());
                break;
            case 6:
                abaaVar = new abaa((may) this.a, (abvn) this.b.io());
                break;
            case 7:
                isx isxVarA = (isx) obj;
                String str = isxVarA.a;
                String strAe = ahno.ae(str);
                itd itdVar = (itd) this.a;
                ConcurrentHashMap concurrentHashMap = itdVar.e;
                if (concurrentHashMap.containsKey(strAe)) {
                    int iIntValue = ((Integer) concurrentHashMap.get(strAe)).intValue();
                    isw iswVar = new isw(isxVarA);
                    iswVar.b(str + " (" + iIntValue + ')');
                    isxVarA = iswVar.a();
                    concurrentHashMap.put(strAe, Integer.valueOf(iIntValue + 1));
                } else {
                    concurrentHashMap.put(strAe, 1);
                }
                Object obj2 = this.b;
                isz iszVar = itdVar.d;
                File file = (File) obj2;
                ahno.K(file.exists(), "Given playlist directory does not exist: %s", file.getAbsolutePath());
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(isxVarA.a.replaceAll("[\\\\/]", "-"));
                sb.append("#EXTM3U\n");
                agke agkeVar = isxVarA.b;
                int size = agkeVar.size();
                while (i2 < size) {
                    isy isyVar = (isy) agkeVar.get(i2);
                    String str2 = isyVar.c + " - " + isyVar.a;
                    sb.append("#EXTINF:" + isyVar.b + ", " + str2 + '\n');
                    sb.append(isyVar.d);
                    sb.append('\n');
                    i2++;
                }
                return iszVar.b.submit(new itc(new File(file, strValueOf.concat(".m3u")), sb, i3));
            case 8:
                return ((iuf) this.a).P((iux) obj, this.b);
            case 9:
                String str3 = (String) obj;
                Uri uriN = ixt.n(str3);
                String str4 = (String) ((agkj) this.b).get(str3);
                iuf iufVar = (iuf) this.a;
                return ahno.ar(iufVar.y(uriN), new itg(str4, i), iufVar.d);
            case 10:
                String str5 = (String) obj;
                Uri uriN2 = ixt.n(str5);
                String str6 = (String) ((agkj) this.b).get(str5);
                iuo iuoVar = (iuo) this.a;
                return ahno.ar(iuoVar.z(uriN2), new itg(str6, 18), iuoVar.d);
            case 11:
                return ((iuo) this.a).Q((iux) obj, this.b);
            case 12:
                String str7 = ((anrv) obj).f;
                jfb jfbVar = (jfb) this.b;
                return jfbVar.e.d(str7, this.a, jfbVar.c);
            case 13:
                jla jlaVar = (jla) obj;
                aihf aihfVarCreateBuilder = anrv.a.createBuilder();
                alay alayVarD = ackj.d(jlaVar.a);
                aihfVarCreateBuilder.copyOnWrite();
                anrv anrvVar = (anrv) aihfVarCreateBuilder.instance;
                alayVarD.getClass();
                anrvVar.c = alayVarD;
                anrvVar.b |= 1;
                aihh aihhVar = (aihh) alja.a.createBuilder();
                aliz alizVar = aliz.CHECK;
                aihhVar.copyOnWrite();
                alja aljaVar = (alja) aihhVar.instance;
                aljaVar.c = alizVar.yN;
                aljaVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                anrv anrvVar2 = (anrv) aihfVarCreateBuilder.instance;
                alja aljaVar2 = (alja) aihhVar.build();
                aljaVar2.getClass();
                anrvVar2.d = aljaVar2;
                anrvVar2.b |= 2;
                String str8 = jlaVar.d;
                aihfVarCreateBuilder.copyOnWrite();
                anrv anrvVar3 = (anrv) aihfVarCreateBuilder.instance;
                str8.getClass();
                anrvVar3.b |= 8;
                anrvVar3.f = str8;
                anon anonVarE = anop.e(str8);
                anonVarE.am(Boolean.valueOf(jlaVar.b));
                hcb hcbVar = ((jlb) this.a).b;
                hcbVar.c();
                hcbVar.e(anonVarE.an());
                ajwo ajwoVar = ajwo.a;
                aihh aihhVar2 = (aihh) ajwoVar.createBuilder();
                aihl aihlVar = ajwm.b;
                ajwm ajwmVar = ajwm.a;
                aihf aihfVarCreateBuilder2 = ajwmVar.createBuilder();
                aihfVarCreateBuilder2.aO((agke) Collection.EL.stream(this.b).map(new iuk(jlaVar, 5)).collect(aghu.a));
                ajwo ajwoVar2 = jlb.a;
                aihfVarCreateBuilder2.aP(ajwoVar2);
                aihfVarCreateBuilder2.aP(jlaVar.c);
                aihhVar2.e(aihlVar, (ajwm) aihfVarCreateBuilder2.build());
                aihfVarCreateBuilder.copyOnWrite();
                anrv anrvVar4 = (anrv) aihfVarCreateBuilder.instance;
                ajwo ajwoVar3 = (ajwo) aihhVar2.build();
                ajwoVar3.getClass();
                anrvVar4.g = ajwoVar3;
                anrvVar4.b |= 16;
                aiqe aiqeVar = aiqe.a;
                aihf aihfVarCreateBuilder3 = aiqeVar.createBuilder();
                aiqd aiqdVar = jlaVar.e;
                aihfVarCreateBuilder3.copyOnWrite();
                aiqe aiqeVar2 = (aiqe) aihfVarCreateBuilder3.instance;
                aiqdVar.getClass();
                aiqeVar2.c = aiqdVar;
                aiqeVar2.b |= 1;
                aiqe aiqeVar3 = (aiqe) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder.copyOnWrite();
                anrv anrvVar5 = (anrv) aihfVarCreateBuilder.instance;
                aiqeVar3.getClass();
                anrvVar5.i = aiqeVar3;
                anrvVar5.b |= 64;
                aihh aihhVar3 = (aihh) ajwoVar.createBuilder();
                aihl aihlVar2 = ajwm.b;
                aihf aihfVarCreateBuilder4 = ajwmVar.createBuilder();
                aihfVarCreateBuilder4.aP(ajwoVar2);
                aihhVar3.e(aihlVar2, (ajwm) aihfVarCreateBuilder4.build());
                aihfVarCreateBuilder.copyOnWrite();
                anrv anrvVar6 = (anrv) aihfVarCreateBuilder.instance;
                ajwo ajwoVar4 = (ajwo) aihhVar3.build();
                ajwoVar4.getClass();
                anrvVar6.h = ajwoVar4;
                anrvVar6.b |= 32;
                aihf aihfVarCreateBuilder5 = aiqeVar.createBuilder();
                aiqd aiqdVar2 = jlaVar.f;
                aihfVarCreateBuilder5.copyOnWrite();
                aiqe aiqeVar4 = (aiqe) aihfVarCreateBuilder5.instance;
                aiqdVar2.getClass();
                aiqeVar4.c = aiqdVar2;
                aiqeVar4.b |= 1;
                aiqe aiqeVar5 = (aiqe) aihfVarCreateBuilder5.build();
                aihfVarCreateBuilder.copyOnWrite();
                anrv anrvVar7 = (anrv) aihfVarCreateBuilder.instance;
                aiqeVar5.getClass();
                anrvVar7.j = aiqeVar5;
                anrvVar7.b |= SemanticState.Focused;
                aihh aihhVar4 = (aihh) apji.a.createBuilder();
                aihhVar4.e(anrx.b, (anrv) aihfVarCreateBuilder.build());
                return (apji) aihhVar4.build();
            case 14:
                tge tgeVar = new tge((quk) this.b);
                tgeVar.c = new quh(((qwm) obj).m, ((quh) this.a).b);
                return tgeVar.e();
            case 15:
                aihf builder = ((atop) obj).toBuilder();
                Object obj3 = this.a;
                obj3.getClass();
                builder.copyOnWrite();
                ((atop) builder.instance).a().put(this.b, obj3);
                return (atop) builder.build();
            case 16:
                tmt tmtVar = (tmt) obj;
                ((awri) this.b).a = true;
                tmtVar.getClass();
                ainp ainpVar = tmtVar.j;
                aihh aihhVar5 = ainpVar == null ? (aihh) ainp.a.createBuilder() : (aihh) ainpVar.toBuilder();
                ?? r12 = this.a;
                aihhVar5.getClass();
                r12.invoke(aihhVar5);
                tms tmsVar = new tms(tmtVar);
                tmsVar.c = (ainp) aihhVar5.build();
                return tmsVar.a();
            case 17:
                return Stream.CC.ofNullable(((wbx) this.b).d((Snapshot) this.a, (String) obj));
            case 18:
                wch wchVar = (wch) this.a;
                Throwable th = wchVar.a;
                ?? r13 = this.b;
                if (th != null) {
                    throw new RuntimeException("EntityStore failed loading from .so", th);
                }
                try {
                    Object objIo = r13.io();
                    if (objIo != null) {
                        return (wck) objIo;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                } catch (Throwable th2) {
                    twu.c(6, "Error loading store", th2);
                    wchVar.a = th2;
                    throw th2;
                }
            case 19:
                FormatIdOuterClass$FormatId defaultInstance = ((SelectableFormatsOuterClass$SelectableVideoFormat) obj).b;
                if (defaultInstance == null) {
                    defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                }
                return yol.a(defaultInstance, this.b, this.a);
            default:
                FormatIdOuterClass$FormatId defaultInstance2 = ((SelectableFormatsOuterClass$SelectableAudioFormat) obj).b;
                if (defaultInstance2 == null) {
                    defaultInstance2 = FormatIdOuterClass$FormatId.getDefaultInstance();
                }
                return yol.a(defaultInstance2, this.b, this.a);
        }
        return abaaVar;
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

    public /* synthetic */ hph(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
