package com.google.android.libraries.youtube.media.player.exo2.platypus;

import defpackage.agke;
import defpackage.agpi;
import defpackage.agpr;
import defpackage.agqs;
import defpackage.zcf;
import defpackage.zjr;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ClipQueue {
    public final List a = DesugarCollections.synchronizedList(new ArrayList());
    private final Set b = ConcurrentHashMap.newKeySet();

    /* JADX INFO: compiled from: PG */
    final class TransitionResult {
        final agke a;
        final Set b;

        public TransitionResult(agke agkeVar, Set set) {
            this.a = agkeVar;
            this.b = set;
        }
    }

    final long a() {
        Long lI = i();
        if (lI == null) {
            return 0L;
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        return lI.longValue() / 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final TransitionResult b(ClipWrapper clipWrapper, boolean z) {
        agke agkeVarN;
        List list = this.a;
        int iIndexOf = list.indexOf(clipWrapper);
        if (iIndexOf < 0) {
            return null;
        }
        if (iIndexOf == 0) {
            return new TransitionResult(agpi.a, agpr.a);
        }
        List listSubList = list.subList(0, iIndexOf);
        HashSet hashSet = new HashSet();
        synchronized (list) {
            agkeVarN = agke.n(listSubList);
            List listSubList2 = list.subList(iIndexOf, list.size());
            agqs agqsVarListIterator = agkeVarN.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                hashSet.add(((ClipWrapper) agqsVarListIterator.next()).b);
            }
            Iterator it = listSubList2.iterator();
            while (it.hasNext()) {
                hashSet.remove(((ClipWrapper) it.next()).b);
            }
        }
        if (z) {
            Set set = this.b;
            synchronized (set) {
                set.addAll(hashSet);
            }
        }
        listSubList.clear();
        return new TransitionResult(agkeVarN, hashSet);
    }

    final ClipWrapper c() {
        ClipWrapper[] clipWrapperArr = (ClipWrapper[]) this.a.toArray(new ClipWrapper[0]);
        if (clipWrapperArr.length > 0) {
            return clipWrapperArr[0];
        }
        return null;
    }

    final ClipWrapper d(zcf zcfVar) {
        for (ClipWrapper clipWrapper : (ClipWrapper[]) this.a.toArray(new ClipWrapper[0])) {
            if (clipWrapper.a.equals(zcfVar)) {
                return clipWrapper;
            }
        }
        return null;
    }

    final ClipWrapper e() {
        ClipWrapper[] clipWrapperArr = (ClipWrapper[]) this.a.toArray(new ClipWrapper[0]);
        int length = clipWrapperArr.length;
        if (length > 0) {
            return clipWrapperArr[length - 1];
        }
        return null;
    }

    final PlaybackControllerWrapper f(String str) {
        for (ClipWrapper clipWrapper : (ClipWrapper[]) this.a.toArray(new ClipWrapper[0])) {
            if (clipWrapper.a.a.equals(str)) {
                return clipWrapper.b;
            }
        }
        for (PlaybackControllerWrapper playbackControllerWrapper : this.b) {
            if (playbackControllerWrapper.e.a.equals(str)) {
                return playbackControllerWrapper;
            }
        }
        return null;
    }

    final zcf g(String str, long j, long j2) {
        ClipWrapper[] clipWrapperArr = (ClipWrapper[]) this.a.toArray(new ClipWrapper[0]);
        for (int i = 1; i < clipWrapperArr.length; i++) {
            zcf zcfVar = clipWrapperArr[i].a;
            if (zcfVar.a.equals(str) && zcfVar.e == j && zcfVar.f == j2) {
                return zcfVar;
            }
        }
        return null;
    }

    final agke h() {
        return agke.p((ClipWrapper[]) this.a.toArray(new ClipWrapper[0]));
    }

    final Long i() {
        ClipWrapper clipWrapperC = c();
        if (clipWrapperC != null) {
            PlaybackControllerWrapper playbackControllerWrapper = clipWrapperC.b;
            zcf zcfVar = clipWrapperC.a;
            zjr zjrVar = zcfVar.H;
            long j = playbackControllerWrapper.b.e;
            if (j != zjrVar.v()) {
                return Long.valueOf(j);
            }
            if (!zcfVar.A.B()) {
                return 0L;
            }
        }
        return null;
    }

    final Set j() {
        HashSet hashSet;
        Set set = this.b;
        synchronized (set) {
            hashSet = new HashSet(set);
            set.clear();
        }
        return hashSet;
    }

    final Set k(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((ClipWrapper) it.next()).b);
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            hashSet.remove(((ClipWrapper) it2.next()).b);
        }
        return hashSet;
    }

    final void l(ClipWrapper clipWrapper) {
        this.a.add(clipWrapper);
    }

    final void m() {
        ClipQueue$$ExternalSyntheticLambda0 clipQueue$$ExternalSyntheticLambda0 = new ClipQueue$$ExternalSyntheticLambda0();
        List list = this.a;
        for (ClipWrapper clipWrapper : (ClipWrapper[]) list.toArray(new ClipWrapper[0])) {
            clipQueue$$ExternalSyntheticLambda0.r(clipWrapper);
        }
        n(new ClipQueue$$ExternalSyntheticLambda1());
        o();
        list.clear();
    }

    final void n(Consumer consumer) {
        ClipWrapper[] clipWrapperArr = (ClipWrapper[]) this.a.toArray(new ClipWrapper[0]);
        HashSet hashSet = new HashSet();
        for (ClipWrapper clipWrapper : clipWrapperArr) {
            hashSet.add(clipWrapper.b);
        }
        Iterable$EL.forEach(hashSet, consumer);
    }

    final void o() {
        Iterable$EL.forEach(j(), new ClipQueue$$ExternalSyntheticLambda1());
    }

    final boolean p() {
        return this.a.isEmpty();
    }

    final boolean q(ClipWrapper clipWrapper, boolean z) {
        TransitionResult transitionResultB = b(clipWrapper, z);
        if (transitionResultB == null) {
            return false;
        }
        Iterable$EL.forEach(transitionResultB.a, new ClipQueue$$ExternalSyntheticLambda0());
        if (!z) {
            Iterable$EL.forEach(transitionResultB.b, new ClipQueue$$ExternalSyntheticLambda1());
        }
        return true;
    }

    final void r() {
        List list = this.a;
        if (list.size() > 1) {
            List listSubList = list.subList(1, list.size());
            agke agkeVarN = agke.n(listSubList);
            listSubList.clear();
            Set setK = k(agkeVarN);
            Collection.EL.stream(agkeVarN).forEach(new ClipQueue$$ExternalSyntheticLambda0());
            Iterable$EL.forEach(setK, new ClipQueue$$ExternalSyntheticLambda1());
        }
    }
}
