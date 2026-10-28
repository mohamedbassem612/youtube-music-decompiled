package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ydo extends ydi {
    public ydn a;

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        String string;
        final String str;
        final ydn ydnVar;
        xvz xvzVar;
        Optional optionalOfNullable;
        aihl aihlVarCheckIsLite;
        Object objK;
        Object objC;
        aihl aihlVarCheckIsLite2;
        aihi aihiVar;
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        TvSignInActivity tvSignInActivity = (TvSignInActivity) getActivity();
        if (getArguments() == null || getArguments().getString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail") == null) {
            string = tvSignInActivity.e;
            if (string == null) {
                str = null;
            }
            ydnVar = this.a;
            final String str2 = tvSignInActivity.c;
            xvzVar = tvSignInActivity.d;
            xvg xvgVar = tvSignInActivity.g;
            final int i = tvSignInActivity.f;
            int i2 = tvSignInActivity.i;
            optionalOfNullable = tvSignInActivity.h;
            ydnVar.b = false;
            if (ydnVar.p.e == null) {
                ydnVar.h.ap(false, 19);
            }
            ydnVar.e.b(xhb.a(36387), null, yno.cO(yno.cP(i), i2));
            if (!ydnVar.r.l(140, 45644495L, false)) {
                ydnVar.o.a(xvzVar, "started");
            }
            ydnVar.k = xvzVar;
            ydnVar.l = xvgVar;
            ydnVar.m = i;
            ydnVar.q = i2;
            if (true == optionalOfNullable.isPresent()) {
                Object obj = optionalOfNullable.get();
                aihlVarCheckIsLite2 = aihn.checkIsLite(apzk.b);
                aihiVar = (aihi) obj;
                aihiVar.c(aihlVarCheckIsLite2);
                if (true != aihiVar.j.n(aihlVarCheckIsLite2.d)) {
                    optionalOfNullable = Optional.empty();
                }
            }
            if (true == optionalOfNullable.isPresent()) {
                Object obj2 = optionalOfNullable.get();
                aihlVarCheckIsLite = aihn.checkIsLite(apzk.b);
                aihi aihiVar2 = (aihi) obj2;
                aihiVar2.c(aihlVarCheckIsLite);
                objK = aihiVar2.j.k(aihlVarCheckIsLite.d);
                if (objK == null) {
                    objC = aihlVarCheckIsLite.b;
                } else {
                    objC = aihlVarCheckIsLite.c(objK);
                }
                optionalOfNullable = Optional.ofNullable((apzk) objC);
            }
            ydnVar.n = (apzk) optionalOfNullable.orElse(null);
            cc ccVar = ydnVar.g;
            ListenableFuture listenableFutureSubmit = ydnVar.f.submit(afwl.j(new wci(ydnVar, str, 13)));
            final int i3 = 1;
            twi twiVar = new twi() { // from class: ydk
                @Override // defpackage.twi
                public final void a(Object obj3) {
                    if (i3 == 0) {
                        int i4 = i;
                        String str3 = str;
                        ydnVar.b(str2, str3, i4);
                        return;
                    }
                    ((agrc) ((agrc) ((agrc) ydn.a.b().i(agso.a, "MDX.PermissionsController")).j((Throwable) obj3)).k("com/google/android/libraries/youtube/mdx/tvsignin/PermissionsControllerImpl", "onActivityCreated", (char) 231, "PermissionsControllerImpl.java")).t("Error while setting up account cookies");
                    int i5 = i;
                    String str4 = str;
                    ydnVar.b(str2, str4, i5);
                }
            };
            final int i4 = 0;
            taf.k(ccVar, listenableFutureSubmit, twiVar, new twi() { // from class: ydk
                @Override // defpackage.twi
                public final void a(Object obj3) {
                    if (i4 == 0) {
                        int i5 = i;
                        String str3 = str;
                        ydnVar.b(str2, str3, i5);
                        return;
                    }
                    ((agrc) ((agrc) ((agrc) ydn.a.b().i(agso.a, "MDX.PermissionsController")).j((Throwable) obj3)).k("com/google/android/libraries/youtube/mdx/tvsignin/PermissionsControllerImpl", "onActivityCreated", (char) 231, "PermissionsControllerImpl.java")).t("Error while setting up account cookies");
                    int i6 = i;
                    String str4 = str;
                    ydnVar.b(str2, str4, i6);
                }
            });
        }
        string = getArguments().getString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail");
        str = string;
        ydnVar = this.a;
        final String str3 = tvSignInActivity.c;
        xvzVar = tvSignInActivity.d;
        xvg xvgVar2 = tvSignInActivity.g;
        final int i5 = tvSignInActivity.f;
        int i6 = tvSignInActivity.i;
        optionalOfNullable = tvSignInActivity.h;
        ydnVar.b = false;
        if (ydnVar.p.e == null) {
            ydnVar.h.ap(false, 19);
        }
        ydnVar.e.b(xhb.a(36387), null, yno.cO(yno.cP(i5), i6));
        if (!ydnVar.r.l(140, 45644495L, false)) {
            ydnVar.o.a(xvzVar, "started");
        }
        ydnVar.k = xvzVar;
        ydnVar.l = xvgVar2;
        ydnVar.m = i5;
        ydnVar.q = i6;
        if (true == optionalOfNullable.isPresent()) {
            Object obj3 = optionalOfNullable.get();
            aihlVarCheckIsLite2 = aihn.checkIsLite(apzk.b);
            aihiVar = (aihi) obj3;
            aihiVar.c(aihlVarCheckIsLite2);
            if (true != aihiVar.j.n(aihlVarCheckIsLite2.d)) {
                optionalOfNullable = Optional.empty();
            }
        }
        if (true == optionalOfNullable.isPresent()) {
            Object obj4 = optionalOfNullable.get();
            aihlVarCheckIsLite = aihn.checkIsLite(apzk.b);
            aihi aihiVar3 = (aihi) obj4;
            aihiVar3.c(aihlVarCheckIsLite);
            objK = aihiVar3.j.k(aihlVarCheckIsLite.d);
            if (objK == null) {
                objC = aihlVarCheckIsLite.b;
            } else {
                objC = aihlVarCheckIsLite.c(objK);
            }
            optionalOfNullable = Optional.ofNullable((apzk) objC);
        }
        ydnVar.n = (apzk) optionalOfNullable.orElse(null);
        cc ccVar2 = ydnVar.g;
        ListenableFuture listenableFutureSubmit2 = ydnVar.f.submit(afwl.j(new wci(ydnVar, str, 13)));
        final int i7 = 1;
        twi twiVar2 = new twi() { // from class: ydk
            @Override // defpackage.twi
            public final void a(Object obj5) {
                if (i7 == 0) {
                    int i8 = i5;
                    String str4 = str;
                    ydnVar.b(str3, str4, i8);
                    return;
                }
                ((agrc) ((agrc) ((agrc) ydn.a.b().i(agso.a, "MDX.PermissionsController")).j((Throwable) obj5)).k("com/google/android/libraries/youtube/mdx/tvsignin/PermissionsControllerImpl", "onActivityCreated", (char) 231, "PermissionsControllerImpl.java")).t("Error while setting up account cookies");
                int i9 = i5;
                String str5 = str;
                ydnVar.b(str3, str5, i9);
            }
        };
        final int i8 = 0;
        taf.k(ccVar2, listenableFutureSubmit2, twiVar2, new twi() { // from class: ydk
            @Override // defpackage.twi
            public final void a(Object obj5) {
                if (i8 == 0) {
                    int i9 = i5;
                    String str4 = str;
                    ydnVar.b(str3, str4, i9);
                    return;
                }
                ((agrc) ((agrc) ((agrc) ydn.a.b().i(agso.a, "MDX.PermissionsController")).j((Throwable) obj5)).k("com/google/android/libraries/youtube/mdx/tvsignin/PermissionsControllerImpl", "onActivityCreated", (char) 231, "PermissionsControllerImpl.java")).t("Error while setting up account cookies");
                int i10 = i5;
                String str5 = str;
                ydnVar.b(str3, str5, i10);
            }
        });
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ydn ydnVar = this.a;
        View viewInflate = layoutInflater.inflate(R.layout.mdx_tvsignin_permissions_fragment, viewGroup, false);
        ydnVar.c = viewInflate.findViewById(R.id.loading);
        return viewInflate;
    }
}
