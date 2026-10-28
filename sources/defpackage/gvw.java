package defpackage;

import android.view.accessibility.AccessibilityManager;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gvw implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gvw(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aihf builder = ((ailt) obj).toBuilder();
            String strO = ((kjc) this.b).o();
            aihf aihfVarCreateBuilder = ailc.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ailc ailcVar = (ailc) aihfVarCreateBuilder.instance;
            ailcVar.b |= 1;
            ailcVar.c = this.a + 1;
            ailc ailcVar2 = (ailc) aihfVarCreateBuilder.build();
            ailcVar2.getClass();
            builder.copyOnWrite();
            ailt ailtVar = (ailt) builder.instance;
            aiip aiipVar = ailtVar.b;
            if (!aiipVar.b) {
                ailtVar.b = aiipVar.a();
            }
            ailtVar.b.put(strO, ailcVar2);
            return (ailt) builder.build();
        }
        if (i == 1) {
            Optional optional = (Optional) obj;
            get getVar = (get) this.b;
            getVar.p = true;
            if (optional.isEmpty()) {
                return gft.a;
            }
            if (this.a == 2) {
                getVar.u((ajwo) optional.get());
            } else {
                ((vxe) getVar.bM.io()).a((ajwo) optional.get());
            }
            return gft.g;
        }
        if (i == 2) {
            Object obj2 = this.b;
            odx odxVar = (odx) obj2;
            if (odxVar.b) {
                int i2 = this.a;
                if (i2 < odxVar.c) {
                    odxVar.a.b(new awu(obj2, i2, 19), odxVar.d * ((long) Math.pow(2.0d, i2)));
                }
            }
            return odw.f;
        }
        aqdp aqdpVar = null;
        if (i == 3) {
            Optional optional2 = (Optional) obj;
            boolean zIsPresent = optional2.isPresent();
            Object obj3 = this.b;
            if (zIsPresent) {
                aohq aohqVar = (aohq) optional2.get();
                for (aqdp aqdpVar2 : aohqVar.getStreamsProgress()) {
                    int i3 = this.a;
                    if (aqdpVar2.h == i3) {
                        aqdpVar = aqdpVar2;
                        break;
                    }
                }
                if (aqdpVar != null) {
                    try {
                        wer werVarE = ((aaea) obj3).b.e();
                        aoho aohoVarD = aohqVar.d();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(aqdpVar));
                        aihf aihfVar = aohoVarD.a;
                        List<aqdp> listUnmodifiableList = DesugarCollections.unmodifiableList(((aohr) aihfVar.instance).d);
                        aihfVar.copyOnWrite();
                        ((aohr) aihfVar.instance).d = aohr.emptyProtobufList();
                        for (aqdp aqdpVar3 : listUnmodifiableList) {
                            if (!linkedHashSet.contains(aqdpVar3)) {
                                aihfVar.bZ(aqdpVar3);
                            }
                        }
                        werVarE.e(aohoVarD.ao());
                        werVarE.b().G();
                    } catch (RuntimeException e) {
                        ((agrc) ((agrc) ((agrc) aaea.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/EntitiesBasedStreamStore", "deleteStreamFunction", (char) 427, "EntitiesBasedStreamStore.java")).t("Issue with deleteStream in entityStore");
                        return Boolean.FALSE;
                    }
                }
            }
            return Boolean.TRUE;
        }
        Boolean bool = (Boolean) obj;
        Object obj4 = this.b;
        acpe acpeVar = (acpe) obj4;
        if (acpeVar.f == null || !acpeVar.k || !bool.booleanValue() || acpeVar.l || this.a != acpeVar.r) {
            return aher.a;
        }
        AccessibilityManager accessibilityManager = acpeVar.j;
        if (accessibilityManager == null || accessibilityManager.isTouchExplorationEnabled()) {
            acpeVar.c();
            return aher.a;
        }
        if (!acpeVar.l) {
            acpeVar.l = true;
            acpc acpcVar = acpeVar.c;
            iud iudVar = new iud(acpcVar, 17);
            auor auorVar = acpcVar.i;
            Executor executor = acpcVar.a;
            auorVar.d(iudVar, executor);
            auorVar.d(new iud(acpcVar, 18), executor);
        }
        acfz.I(acpeVar.f, true);
        int i4 = acpeVar.n;
        if (i4 > 0) {
            acpeVar.f.postDelayed(new abyz(obj4, 20), i4);
        }
        if (acpeVar.i != null && acpeVar.a == 1) {
            acpeVar.a = 3;
            xgn xgnVarHB = acpeVar.b.hB();
            xhc xhcVar = acpeVar.i;
            xhcVar.getClass();
            xgnVarHB.w(new xgj(xhcVar), null);
        }
        return aher.a;
    }
}
