package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omj {
    public final Object a;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public omj(Optional optional, Map map, Set set) {
        if (((Boolean) optional.orElse(Boolean.FALSE)).booleanValue()) {
            this.a = (Map) Stream.CC.concat(Collection.EL.stream(((agpn) map).values()), Collection.EL.stream(set)).collect(aghu.a(new ixa(17), Function$CC.identity()));
            return;
        }
        this.a = new HashMap();
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ?? r4 = this.a;
            aihl aihlVar = arnq.b;
            aihlVar.getClass();
            r4.put(Integer.valueOf(aihlVar.a()), (vwt) entry.getValue());
        }
    }

    public static afkb U(qrx qrxVar) {
        if (qrxVar.b instanceof qru) {
            return new afkb(new jnu(qrxVar, new omj(qrxVar), 4, null), MoreExecutors.directExecutor());
        }
        throw new IllegalArgumentException("Variant does not implement WarmableXDataStore");
    }

    public static final boolean d(long j) {
        return j % 100 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(fkn fknVar) {
        if (fknVar instanceof nri) {
            fknVar.e();
        }
    }

    public static mxc s(mxc mxcVar, nsl nslVar, nuc nucVar) {
        return mxcVar instanceof ngf ? t(mxcVar, nslVar, nucVar) : mxcVar;
    }

    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object, mxb] */
    public static mxc t(mxc mxcVar, nsl nslVar, nuc nucVar) {
        agke agkeVarG;
        int iBt;
        agke agkeVarG2;
        agke agkeVarG3;
        agke agkeVarG4;
        agke agkeVarG5;
        int iBb;
        int iBt2;
        try {
            if (!mxcVar.y()) {
                return mxcVar;
            }
            String strU = mxcVar.u();
            ArrayList arrayList = new ArrayList();
            int[] iArrCopyOf = null;
            if (mxcVar.h() != 0) {
                ArrayList arrayList2 = new ArrayList();
                PriorityQueue priorityQueue = new PriorityQueue(1, Comparator$CC.comparingInt(new ddc(5)));
                for (int i = 0; i < mxcVar.h(); i++) {
                    mxb mxbVarN = mxcVar.n(i);
                    if (mxbVarN.g() == 0) {
                        priorityQueue.add(mxbVarN);
                    } else {
                        arrayList2.add(mxbVarN);
                    }
                }
                if (priorityQueue.isEmpty()) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        mxb mxbVar = (mxb) arrayList2.get(i2);
                        arrayList.add(new tld(mxbVar, mxbVar.h(), mxbVar.g(), (byte[]) null));
                    }
                } else {
                    int size2 = priorityQueue.size();
                    int[] iArr = new int[size2];
                    int i3 = 0;
                    while (!priorityQueue.isEmpty()) {
                        mxb mxbVar2 = (mxb) priorityQueue.poll();
                        if (mxbVar2 != null) {
                            iArr[i3] = mxbVar2.h();
                            arrayList.add(new tld(mxbVar2, mxbVar2.h() + i3, 1L, (byte[]) null));
                            i3++;
                        }
                    }
                    iArrCopyOf = i3 < size2 ? Arrays.copyOf(iArr, i3) : iArr;
                    int size3 = arrayList2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        mxb mxbVar3 = (mxb) arrayList2.get(i4);
                        tke tkeVarBM = qnl.bM(mxbVar3.h(), mxbVar3.g(), iArrCopyOf, false);
                        arrayList.add(new tld(mxbVar3, tkeVarBM.a, tkeVarBM.b, (byte[]) null));
                    }
                }
            }
            if (iArrCopyOf == null || iArrCopyOf.length == 0) {
                return mxcVar;
            }
            aihf aihfVarCreateBuilder = askp.a.createBuilder();
            String strG = rpi.g(strU, iArrCopyOf);
            aihfVarCreateBuilder.copyOnWrite();
            askp askpVar = (askp) aihfVarCreateBuilder.instance;
            strG.getClass();
            askpVar.b |= 1;
            askpVar.c = strG;
            if (mxcVar.B()) {
                float fG = mxcVar.g();
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar2 = (askp) aihfVarCreateBuilder.instance;
                askpVar2.b |= 2;
                askpVar2.d = fG;
            }
            if (mxcVar.w() && (iBt2 = a.bt(mxcVar.G() - 1)) != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar3 = (askp) aihfVarCreateBuilder.instance;
                askpVar3.e = iBt2 - 1;
                askpVar3.b |= 4;
            }
            if (mxcVar.z() && (iBb = a.bb(mxcVar.E() - 1)) != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar4 = (askp) aihfVarCreateBuilder.instance;
                askpVar4.f = iBb - 1;
                askpVar4.b |= 8;
            }
            if (mxcVar.i() > 0) {
                if (mxcVar.i() == 0) {
                    agkeVarG5 = agpi.a;
                } else {
                    int i5 = mxcVar.i();
                    aguu.ag(i5, "expectedSize");
                    agjz agjzVar = new agjz(i5);
                    for (int i6 = 0; i6 < mxcVar.i(); i6++) {
                        mxe mxeVarO = mxcVar.o(i6);
                        aihh aihhVar = (aihh) ((askq) aihn.parseFrom(askq.a, mxeVarO.f())).toBuilder();
                        int iH = mxeVarO.h();
                        int iG = mxeVarO.g();
                        if (iArrCopyOf.length > 0) {
                            tke tkeVarBM2 = qnl.bM(mxeVarO.h(), mxeVarO.g(), iArrCopyOf, false);
                            int i7 = tkeVarBM2.a;
                            iG = tkeVarBM2.b;
                            iH = i7;
                        }
                        aihhVar.copyOnWrite();
                        askq askqVar = (askq) aihhVar.instance;
                        askqVar.b |= 1;
                        askqVar.c = iH;
                        if (mxeVarO.l()) {
                            aihhVar.copyOnWrite();
                            askq askqVar2 = (askq) aihhVar.instance;
                            askqVar2.b |= 2;
                            askqVar2.d = iG;
                        }
                        agjzVar.h((askq) aihhVar.build());
                    }
                    agkeVarG5 = agjzVar.g();
                }
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar5 = (askp) aihfVarCreateBuilder.instance;
                askpVar5.a();
                aifs.addAll(agkeVarG5, askpVar5.g);
            }
            if (mxcVar.m() > 0) {
                if (mxcVar.m() == 0) {
                    agkeVarG4 = agpi.a;
                } else {
                    int iM = mxcVar.m();
                    aguu.ag(iM, "expectedSize");
                    agjz agjzVar2 = new agjz(iM);
                    for (int i8 = 0; i8 < mxcVar.m(); i8++) {
                        mxy mxyVarT = mxcVar.t(i8);
                        int iM2 = mxyVarT.m();
                        int iL = mxyVarT.l();
                        if (iArrCopyOf.length > 0) {
                            tke tkeVarBM3 = qnl.bM(mxyVarT.m(), mxyVarT.l(), iArrCopyOf, true);
                            int i9 = tkeVarBM3.a;
                            iL = tkeVarBM3.b;
                            iM2 = i9;
                        }
                        aihf builder = ((asku) aihn.parseFrom(asku.a, mxyVarT.f())).toBuilder();
                        builder.copyOnWrite();
                        asku askuVar = (asku) builder.instance;
                        askuVar.b |= 1;
                        askuVar.e = iM2;
                        if (mxyVarT.z()) {
                            builder.copyOnWrite();
                            asku askuVar2 = (asku) builder.instance;
                            askuVar2.b |= 2;
                            askuVar2.f = iL;
                        }
                        agjzVar2.h((asku) builder.build());
                    }
                    agkeVarG4 = agjzVar2.g();
                }
                aihfVarCreateBuilder.cA(agkeVarG4);
            }
            if (mxcVar.l() > 0) {
                if (mxcVar.l() == 0) {
                    agkeVarG3 = agpi.a;
                } else {
                    int iL2 = mxcVar.l();
                    aguu.ag(iL2, "expectedSize");
                    agjz agjzVar3 = new agjz(iL2);
                    for (int i10 = 0; i10 < mxcVar.l(); i10++) {
                        mxx mxxVarS = mxcVar.s(i10);
                        int iH2 = mxxVarS.h();
                        int iG2 = mxxVarS.g();
                        if (iArrCopyOf.length > 0) {
                            tke tkeVarBM4 = qnl.bM(mxxVarS.h(), mxxVarS.g(), iArrCopyOf, true);
                            int i11 = tkeVarBM4.a;
                            iG2 = tkeVarBM4.b;
                            iH2 = i11;
                        }
                        aihf builder2 = ((askt) aihn.parseFrom(askt.a, mxxVarS.f(), ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
                        builder2.copyOnWrite();
                        askt asktVar = (askt) builder2.instance;
                        asktVar.b |= 1;
                        asktVar.c = iH2;
                        builder2.copyOnWrite();
                        askt asktVar2 = (askt) builder2.instance;
                        asktVar2.b |= 2;
                        asktVar2.d = iG2;
                        agjzVar3.h((askt) builder2.build());
                    }
                    agkeVarG3 = agjzVar3.g();
                }
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar6 = (askp) aihfVarCreateBuilder.instance;
                aiie aiieVar = askpVar6.n;
                if (!aiieVar.c()) {
                    askpVar6.n = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(agkeVarG3, askpVar6.n);
            }
            if (mxcVar.h() > 0) {
                rpi.e(arrayList);
                if (arrayList.isEmpty()) {
                    agkeVarG2 = agpi.a;
                } else {
                    int size4 = arrayList.size();
                    aguu.ag(size4, "expectedSize");
                    agjz agjzVar4 = new agjz(size4);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        tld tldVar = (tld) arrayList.get(i12);
                        aihh aihhVar2 = (aihh) asko.a.createBuilder();
                        Object obj = tldVar.a;
                        int i13 = ((tke) obj).a;
                        aihhVar2.copyOnWrite();
                        asko askoVar = (asko) aihhVar2.instance;
                        askoVar.b |= 1;
                        askoVar.c = i13;
                        int i14 = ((tke) obj).b;
                        aihhVar2.copyOnWrite();
                        asko askoVar2 = (asko) aihhVar2.instance;
                        askoVar2.b |= 2;
                        askoVar2.d = i14;
                        ?? r9 = tldVar.b;
                        int iAV = a.aV(r9.k() - 1);
                        if (iAV != 0) {
                            aihhVar2.copyOnWrite();
                            asko askoVar3 = (asko) aihhVar2.instance;
                            askoVar3.f = iAV - 1;
                            askoVar3.b |= 8;
                        }
                        if (r9.j()) {
                            asmv asmvVar = (asmv) aihn.parseFrom(asmv.a, r9.i().f());
                            aihhVar2.copyOnWrite();
                            asko askoVar4 = (asko) aihhVar2.instance;
                            asmvVar.getClass();
                            askoVar4.e = asmvVar;
                            askoVar4.b |= 4;
                        }
                        agjzVar4.h((asko) aihhVar2.build());
                    }
                    agkeVarG2 = agjzVar4.g();
                }
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar7 = (askp) aihfVarCreateBuilder.instance;
                aiie aiieVar2 = askpVar7.j;
                if (!aiieVar2.c()) {
                    askpVar7.j = aihn.mutableCopy(aiieVar2);
                }
                aifs.addAll(agkeVarG2, askpVar7.j);
            }
            if (mxcVar.x()) {
                boolean zV = mxcVar.v();
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar8 = (askp) aihfVarCreateBuilder.instance;
                askpVar8.b |= 16;
                askpVar8.i = zV;
            }
            if (mxcVar.D() && (iBt = a.bt(mxcVar.H() - 1)) != 0) {
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar9 = (askp) aihfVarCreateBuilder.instance;
                askpVar9.k = iBt - 1;
                askpVar9.b |= 32;
            }
            if (mxcVar.j() > 0) {
                if (mxcVar.j() == 0) {
                    agkeVarG = agpi.a;
                } else {
                    int iJ = mxcVar.j();
                    aguu.ag(iJ, "expectedSize");
                    agjz agjzVar5 = new agjz(iJ);
                    for (int i15 = 0; i15 < mxcVar.j(); i15++) {
                        mxf mxfVarP = mxcVar.p(i15);
                        aihf builder3 = ((askr) aihn.parseFrom(askr.a, mxfVarP.f())).toBuilder();
                        if (mxfVarP.h()) {
                            myb mybVarG = mxfVarP.g();
                            mep mepVar = nby.W;
                            if (mybVarG.e(mepVar)) {
                                nby nbyVar = (nby) mxfVarP.g().d(mepVar);
                                int iN = nbyVar.n();
                                int iM3 = nbyVar.m();
                                if (iArrCopyOf.length > 0) {
                                    tke tkeVarBM5 = qnl.bM(nbyVar.n(), nbyVar.m(), iArrCopyOf, false);
                                    int i16 = tkeVarBM5.a;
                                    iM3 = tkeVarBM5.b;
                                    iN = i16;
                                }
                                aihf builder4 = ((asnj) aihn.parseFrom(asnj.a, nbyVar.f())).toBuilder();
                                builder4.copyOnWrite();
                                asnj asnjVar = (asnj) builder4.instance;
                                asnjVar.c |= 1;
                                asnjVar.d = iN;
                                builder4.copyOnWrite();
                                asnj asnjVar2 = (asnj) builder4.instance;
                                asnjVar2.c |= 2;
                                asnjVar2.e = iM3;
                                asnj asnjVar3 = (asnj) builder4.build();
                                aihh aihhVar3 = (aihh) askw.a.createBuilder();
                                aihhVar3.e(asnj.b, asnjVar3);
                                builder3.copyOnWrite();
                                askr askrVar = (askr) builder3.instance;
                                askw askwVar = (askw) aihhVar3.build();
                                askwVar.getClass();
                                askrVar.c = askwVar;
                                askrVar.b |= 1;
                            }
                        }
                        agjzVar5.h((askr) builder3.build());
                    }
                    agkeVarG = agjzVar5.g();
                }
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar10 = (askp) aihfVarCreateBuilder.instance;
                aiie aiieVar3 = askpVar10.l;
                if (!aiieVar3.c()) {
                    askpVar10.l = aihn.mutableCopy(aiieVar3);
                }
                aifs.addAll(agkeVarG, askpVar10.l);
            }
            if (mxcVar.A()) {
                aihf aihfVarCreateBuilder2 = asks.a.createBuilder();
                int iAS = a.aS(mxcVar.q().U() - 1);
                if (iAS != 0) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    asks asksVar = (asks) aihfVarCreateBuilder2.instance;
                    asksVar.d = iAS - 1;
                    asksVar.b |= 2;
                }
                float fCo = mxcVar.q().co();
                aihfVarCreateBuilder2.copyOnWrite();
                asks asksVar2 = (asks) aihfVarCreateBuilder2.instance;
                asksVar2.b |= 1;
                asksVar2.c = fCo;
                aihfVarCreateBuilder.copyOnWrite();
                askp askpVar11 = (askp) aihfVarCreateBuilder.instance;
                asks asksVar3 = (asks) aihfVarCreateBuilder2.build();
                asksVar3.getClass();
                askpVar11.m = asksVar3;
                askpVar11.b |= 64;
            }
            return ngf.aS(((askp) aihfVarCreateBuilder.build()).toByteArray());
        } catch (aiik e) {
            nucVar.f(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, e, "Failed to adjust text spans", new Object[0]);
            return mxcVar;
        }
    }

    public static IntersectionCriteria u(ncy ncyVar) {
        return new IntersectionCriteria(ncyVar.an(), ncyVar.ao() != 3);
    }

    public static boolean v(ndq ndqVar) {
        return ndqVar.ar() || ndqVar.as();
    }

    public static boolean w(neh nehVar) {
        return nehVar.cm() || nehVar.h();
    }

    public static /* synthetic */ CommandOuterClass$Command y(mzg mzgVar, nuc nucVar, nsl nslVar) {
        int[] iArrAG = ksy.aG(mzgVar);
        if (iArrAG.length == 0) {
            return CommandOuterClass$Command.getDefaultInstance();
        }
        int i = iArrAG[0];
        try {
            try {
                return (CommandOuterClass$Command) aihn.parseFrom(CommandOuterClass$Command.a, mzgVar.f(), ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused) {
                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= 2;
                aihfVarCreateBuilder.cC(i);
                nucVar.d((asnc) aihfVarCreateBuilder.build(), nslVar, "Command extension: invalid data.", new Object[0]);
                return CommandOuterClass$Command.getDefaultInstance();
            }
        } catch (IllegalStateException unused2) {
            aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
            aslh aslhVar2 = aslh.LOG_TYPE_INTERNAL_ERROR;
            aihfVarCreateBuilder2.copyOnWrite();
            asnc asncVar2 = (asnc) aihfVarCreateBuilder2.instance;
            asncVar2.d = aslhVar2.I;
            asncVar2.b |= 2;
            aihfVarCreateBuilder2.cC(i);
            nucVar.d((asnc) aihfVarCreateBuilder2.build(), nslVar, "Command extension: cannot serialize with extension number.", new Object[0]);
            return CommandOuterClass$Command.getDefaultInstance();
        } catch (UnsupportedOperationException unused3) {
            aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
            aslh aslhVar3 = aslh.LOG_TYPE_INTERNAL_ERROR;
            aihfVarCreateBuilder3.copyOnWrite();
            asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
            asncVar3.d = aslhVar3.I;
            asncVar3.b |= 2;
            aihfVarCreateBuilder3.cC(i);
            nucVar.d((asnc) aihfVarCreateBuilder3.build(), nslVar, "Command extension: invalid format.", new Object[0]);
            return CommandOuterClass$Command.getDefaultInstance();
        }
    }

    public final boolean A(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (z((asnd) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, nuc] */
    public final omj B(mzg mzgVar, nsl nslVar) {
        return new omj(mzgVar, (nuc) this.a, nslVar);
    }

    public final Integer C(Account account, String[] strArr) {
        final jyc jycVar = new jyc(account, strArr, null);
        String str = jxs.a;
        Object obj = ((vwt) this.a).a;
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
        Account account2 = jycVar.a;
        if (account2 == null) {
            throw new NullPointerException("null reference");
        }
        kro.i(account2.name);
        kro.g("This call can involve network request. It is unsafe to call from main thread.");
        final Context context = (Context) obj;
        qkh.c(context);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Integer num = (Integer) jxz.d(context, jxz.d, new jxy() { // from class: jxu
            @Override // defpackage.jxy
            public final Object a(IBinder iBinder) {
                jrz jrzVar;
                String[] strArr2 = jxz.b;
                if (iBinder == null) {
                    jrzVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                    jrzVar = iInterfaceQueryLocalInterface instanceof jrz ? (jrz) iInterfaceQueryLocalInterface : new jrz(iBinder);
                }
                long j = jElapsedRealtime;
                long j2 = jCurrentTimeMillis;
                Context context2 = context;
                jyc jycVar2 = jycVar;
                Parcel parcelC = jrzVar.c();
                gdc.c(parcelC, jycVar2);
                Parcel parcelD = jrzVar.d(9, parcelC);
                int i = parcelD.readInt();
                parcelD.recycle();
                qkh.c(context2);
                jij jijVar = new jij(context2);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (i == -1) {
                    jijVar.f(1729, 49757, j2, jCurrentTimeMillis2, j);
                } else if (i == 1) {
                    jijVar.f(1729, 49754, j2, jCurrentTimeMillis2, j);
                } else if (i == 2) {
                    jijVar.f(1729, 49755, j2, jCurrentTimeMillis2, j);
                } else if (i == 4) {
                    jijVar.f(1729, 49756, j2, jCurrentTimeMillis2, j);
                } else if (i == 5) {
                    jijVar.f(1729, 49758, j2, jCurrentTimeMillis2, j);
                } else if (i != 6) {
                    jijVar.f(1729, 13, j2, jCurrentTimeMillis2, j);
                } else {
                    jijVar.f(1729, 49759, j2, jCurrentTimeMillis2, j);
                }
                return Integer.valueOf(i);
            }
        });
        num.intValue();
        return num;
    }

    public final Account[] D() {
        Context context = (Context) ((vwt) this.a).a;
        return new kjc(context, (byte[]) null).j(context);
    }

    public final Account[] E(final String[] strArr) throws Exception {
        String str = jxs.a;
        Object obj = this.a;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj2 = ((vwt) obj).a;
        Context context = (Context) obj2;
        qkh.c(context);
        final jij jijVar = new jij(context);
        try {
            if (obj2 == null) {
                throw new NullPointerException("null reference");
            }
            kro.i("com.google");
            jxz.e((Context) obj2);
            final String className = obj2 instanceof Activity ? ((Activity) obj2).getComponentName().getClassName() : "";
            try {
                return (Account[]) jxz.d((Context) obj2, jxz.d, new jxy() { // from class: jxt
                    public final /* synthetic */ String a = "com.google";

                    @Override // defpackage.jxy
                    public final Object a(IBinder iBinder) throws IOException {
                        jrz jrzVar;
                        Parcelable[] parcelableArrK;
                        String[] strArr2 = jxz.b;
                        if (iBinder == null) {
                            jrzVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            jrzVar = iInterfaceQueryLocalInterface instanceof jrz ? (jrz) iInterfaceQueryLocalInterface : new jrz(iBinder);
                        }
                        String str2 = className;
                        String[] strArr3 = strArr;
                        String str3 = this.a;
                        Bundle bundle = new Bundle();
                        bundle.putString("accountType", str3);
                        bundle.putStringArray("account_features", strArr3);
                        bundle.putString("callingActivity", str2);
                        Parcel parcelC = jrzVar.c();
                        gdc.c(parcelC, bundle);
                        Parcel parcelD = jrzVar.d(6, parcelC);
                        Bundle bundle2 = (Bundle) gdc.a(parcelD, Bundle.CREATOR);
                        parcelD.recycle();
                        if (bundle2 == null || (parcelableArrK = aie.k(bundle2, "accounts", Account.class)) == null) {
                            throw new IOException("Receive null result from service call.");
                        }
                        Account[] accountArr = new Account[parcelableArrK.length];
                        for (int i = 0; i < parcelableArrK.length; i++) {
                            accountArr[i] = (Account) parcelableArrK[i];
                        }
                        jijVar.f(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                        return accountArr;
                    }
                });
            } catch (Exception e) {
                e = e;
                jijVar = jijVar;
                Exception exc = e;
                jijVar.f(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                throw exc;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final ListenableFuture F() {
        return L(new ris(16));
    }

    public final ListenableFuture G() {
        return L(new ris(18));
    }

    public final ListenableFuture H(String str) {
        return K(new rhk(str, 11));
    }

    public final ListenableFuture I() {
        return K(new ris(19));
    }

    public final ListenableFuture J() {
        return K(new ris(17));
    }

    public final ListenableFuture K(final Function function) {
        return ahno.ar(((ayq) this.a).i(), new agek() { // from class: rpc
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                return function.apply((atop) obj);
            }
        }, MoreExecutors.directExecutor());
    }

    public final ListenableFuture L(final Function function) {
        return ahno.ar(((ayq) this.a).j(new axp() { // from class: rpb
            @Override // defpackage.axp
            public final Object a(Object obj) {
                return (atop) function.apply((atop) obj);
            }
        }), new rmk(7), MoreExecutors.directExecutor());
    }

    public final Account M(zwa zwaVar) {
        if (!(zwaVar instanceof rlt)) {
            return null;
        }
        return ((rre) this.a).b(((rlt) zwaVar).b);
    }

    public final Account N(zwa zwaVar) {
        if (!(zwaVar instanceof rlt)) {
            return null;
        }
        return rre.a(((rlt) zwaVar).b, ((rre) this.a).e());
    }

    public final void O(rkp rkpVar) {
        ((awlo) this.a).kk(rkpVar);
    }

    public final void P(dd ddVar, zvv zvvVar, ajwo ajwoVar) {
        if (!((vxz) this.a).l(83, 45844767L, false)) {
            rke rkeVar = (rke) ddVar.g("INCOGNITO_BOTTOM_SHEET_FRAGMENT");
            if (rkeVar != null) {
                rkeVar.n = ajwoVar;
                if (rkeVar.isAdded()) {
                    return;
                }
                rkeVar.h(ddVar, "INCOGNITO_BOTTOM_SHEET_FRAGMENT");
                return;
            }
            rke rkeVar2 = new rke();
            Bundle bundle = new Bundle();
            if (ajwoVar != null) {
                bundle.putByteArray("endpoint", ajwoVar.toByteArray());
            }
            rkeVar2.setArguments(bundle);
            rkeVar2.m = zvvVar;
            rkeVar2.h(ddVar, "INCOGNITO_BOTTOM_SHEET_FRAGMENT");
            return;
        }
        rkf rkfVar = (rkf) ddVar.g("INCOGNITO_BOTTOM_SHEET_FRAGMENT");
        if (rkfVar != null) {
            rkfVar.peer().g = ajwoVar;
            if (rkfVar.isAdded()) {
                return;
            }
            rkfVar.h(ddVar, "INCOGNITO_BOTTOM_SHEET_FRAGMENT");
            return;
        }
        rkf rkfVar2 = new rkf();
        auom.f(rkfVar2);
        if (ajwoVar != null) {
            Bundle arguments = rkfVar2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
                rkfVar2.setArguments(arguments);
            }
            arguments.putByteArray("endpoint", ajwoVar.toByteArray());
        }
        rkfVar2.h(ddVar, "INCOGNITO_BOTTOM_SHEET_FRAGMENT");
        rkfVar2.peer().f = zvvVar;
    }

    public final synchronized eym Q() {
        throw null;
    }

    public final synchronized void R() {
        throw null;
    }

    public final ListenableFuture S(qsx qsxVar) {
        ahdm ahdmVarB = ((qso) this.a).b();
        qsd qsdVar = new qsd(qsxVar, 0);
        long j = afwl.a;
        return ahdmVarB.d(new afwf(afty.c(false), qsdVar), MoreExecutors.directExecutor()).g();
    }

    public final MessageLite T() {
        return (MessageLite) ((qru) ((qrx) this.a).b).c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final File V(Uri uri) throws qqb {
        File externalFilesDir;
        if (!uri.getScheme().equals("android")) {
            throw new qqb("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new qqb(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new qqb("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str = (String) arrayList.get(0);
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals("external")) {
                    externalFilesDir = ((Context) this.a).getExternalFilesDir(null);
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new qqb(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str.equals("cache")) {
                    externalFilesDir = ((Context) this.a).getCacheDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new qqb(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str.equals("files")) {
                    externalFilesDir = rmp.I((Context) this.a);
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new qqb(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str.equals("managed")) {
                    File file = new File(rmp.I((Context) this.a), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            if (!qpo.a.equals(qpo.a((String) arrayList.get(2)))) {
                                throw new qqb("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new qqb(e);
                        }
                    }
                    externalFilesDir = file;
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new qqb(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str.equals("directboot-cache")) {
                    externalFilesDir = ((Context) this.a).createDeviceProtectedStorageContext().getCacheDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new qqb(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str.equals("directboot-files")) {
                    externalFilesDir = ((Context) this.a).createDeviceProtectedStorageContext().getFilesDir();
                    return new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new qqb(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new qqb(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    public final int W() {
        return ((AtomicInteger) this.a).get();
    }

    public final void X() {
        ((AtomicInteger) this.a).incrementAndGet();
    }

    public final void Y(qmf qmfVar) {
        qmfVar.a((qmi) this.a);
    }

    public final ahdm Z(omr omrVar) {
        ahdm ahdmVarB = ((qso) this.a).b();
        qsd qsdVar = new qsd(omrVar, 1);
        long j = afwl.a;
        return ahdmVarB.d(new afwf(afty.c(false), qsdVar), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agfr, java.lang.Object] */
    public final oil a() {
        return (oil) this.a.io();
    }

    public final ListenableFuture aa(omr omrVar) {
        return ((qso) this.a).b().d(afwl.e(new qse(omrVar, 1)), MoreExecutors.directExecutor()).g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void ab(ket ketVar) {
        this.a.add(ketVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void ac(ket ketVar) {
        this.a.remove(ketVar);
    }

    public final ListenableFuture b(Callable callable, Executor executor) {
        long j = afwl.a;
        ahcz ahczVar = new ahcz(afty.c(false), callable, 1);
        executor.getClass();
        return ((auor) ((ahud) this.a).b).d(new ahdx(ahczVar), executor);
    }

    public final ListenableFuture c(ahcx ahcxVar, Executor executor) {
        return ((ahud) this.a).T(ahcxVar, executor);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, onc] */
    public final ListenableFuture e(agev agevVar) {
        if (agevVar.g()) {
            return ooi.d(agevVar.c().d()).e(new hys(20), MoreExecutors.directExecutor());
        }
        if (!d(((Random) this.a).nextLong())) {
            return new aher(agdf.a);
        }
        aihf aihfVarCreateBuilder = ahaz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahaz ahazVar = (ahaz) aihfVarCreateBuilder.instance;
        ahazVar.b |= 1;
        ahazVar.c = false;
        ahaz ahazVar2 = (ahaz) aihfVarCreateBuilder.build();
        ahazVar2.getClass();
        return new aher(new agfa(ahazVar2));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mbc] */
    public final long f() {
        return this.a.f().toEpochMilli();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mbc] */
    public final long g() {
        return this.a.c();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, obk] */
    public final ofb h(int i) {
        return new ofb(i, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, obk] */
    public final void i(int i, Throwable th) {
        this.a.b(i - 1, -1L, th, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, obk] */
    public final void j(int i) {
        this.a.b(i - 1, -1L, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, obk] */
    public final void k(int i, String str) {
        this.a.b(i - 1, -1L, null, str);
    }

    public final void l(int i, Runnable runnable) {
        ofb ofbVarH = h(i);
        try {
            ofbVarH.c();
            runnable.run();
            ofbVarH.a();
        } catch (Throwable th) {
            try {
                ofbVarH.b(th);
                throw th;
            } catch (Throwable th2) {
                ofbVarH.a();
                throw th2;
            }
        }
    }

    public final void m(int i, ListenableFuture listenableFuture) {
        ofb ofbVarH = h(i);
        ofbVarH.c();
        tzd tzdVar = new tzd(ofbVarH, 1);
        listenableFuture.addListener(new ahei(listenableFuture, tzdVar), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final Map n() {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((oel) it.next()).b(map);
        }
        return map;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final Map o() {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((oel) it.next()).c(map);
        }
        return map;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nrg] */
    public final fkn p(fhd fhdVar, int i) {
        return this.a.a(fhdVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nrg] */
    public final Map q(fly flyVar) {
        return this.a.c(flyVar);
    }

    public final CommandOuterClass$Command x() {
        Object obj = this.a;
        ((FutureTask) obj).run();
        try {
            return (CommandOuterClass$Command) ((FutureTask) obj).get();
        } catch (InterruptedException e) {
            throw new nud("CommandFuture interrupted", e);
        } catch (ExecutionException e2) {
            throw new nud("CommandFuture failed", e2);
        }
    }

    public final boolean z(asnd asndVar) {
        agkz agkzVar = (agkz) this.a;
        return agkzVar.isEmpty() || agkzVar.contains(asndVar);
    }

    public omj(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public omj(Object obj) {
        this.a = obj;
    }

    public omj(char[] cArr) {
        this.a = new HashSet();
    }

    public omj(char[] cArr, byte[] bArr) {
        this.a = DesugarCollections.synchronizedSet(new HashSet());
    }

    public omj(Context context, byte[] bArr) {
        this.a = new SparseArray();
        AccountManager.get(context).addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: qtn
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                ((SparseArray) this.a.a).clear();
            }
        }, null, false);
    }

    public omj(byte[] bArr, byte[] bArr2) {
        this.a = new awlo();
    }

    public omj(byte[] bArr) {
        this.a = new ArrayList();
    }

    public omj(Iterable iterable) {
        asnd asndVar;
        EnumSet enumSetNoneOf = EnumSet.noneOf(asnd.class);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() != 0) {
                switch (num.intValue()) {
                    case 0:
                        asndVar = asnd.SUBSCRIPTION_UNKNOWN;
                        break;
                    case 1:
                        asndVar = asnd.SUBSCRIPTION_LAYOUT_ROOT_MAX_WIDTH_DIMENSIONS;
                        break;
                    case 2:
                        asndVar = asnd.SUBSCRIPTION_LAYOUT_ROOT_MAX_HEIGHT_DIMENSIONS;
                        break;
                    case 3:
                        asndVar = asnd.SUBSCRIPTION_DEVICE_ORIENTATION;
                        break;
                    case 4:
                        asndVar = asnd.SUBSCRIPTION_WINDOW_SIZE;
                        break;
                    case 5:
                        asndVar = asnd.SUBSCRIPTION_PLATFORM_NAME;
                        break;
                    case 6:
                        asndVar = asnd.SUBSCRIPTION_FORM_FACTOR;
                        break;
                    case 7:
                        asndVar = asnd.SUBSCRIPTION_IS_SCREEN_READER_ACTIVE;
                        break;
                    case 8:
                        asndVar = asnd.SUBSCRIPTION_WINDOW_SAFE_AREA_INSETS;
                        break;
                    case 9:
                        asndVar = asnd.SUBSCRIPTION_IS_REDUCE_ANIMATIONS_SETTING_ENABLED;
                        break;
                    case 10:
                        asndVar = asnd.SUBSCRIPTION_FOLDING_DISPLAY_INFO;
                        break;
                    case 11:
                        asndVar = asnd.SUBSCRIPTION_COLOR_CONTRAST_MODE;
                        break;
                    default:
                        asndVar = null;
                        break;
                }
                if (asndVar != null) {
                    enumSetNoneOf.add(asndVar);
                }
            }
        }
        this.a = ahng.ac(enumSetNoneOf);
    }

    public omj(mzg mzgVar, nuc nucVar, nsl nslVar) {
        this.a = new FutureTask(new iqb(mzgVar, nucVar, nslVar, 6, null));
    }

    public omj(oii oiiVar) {
        this.a = aguu.al(new cbr(oiiVar, 17));
    }

    public omj(Context context) {
        this.a = context.getApplicationContext();
    }

    public omj() {
        this.a = new ahud((short[]) null);
    }

    public omj(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new AtomicInteger();
    }

    public omj(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this("debug.properties.can_override", (byte[]) null);
    }
}
