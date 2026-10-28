package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import defpackage.aag;
import defpackage.adq;
import defpackage.aex;
import defpackage.afi;
import defpackage.boc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationManager$1 extends INavigationManager.Stub {
    final /* synthetic */ adq this$0;
    final /* synthetic */ boc val$lifecycle;

    public NavigationManager$1(adq adqVar, boc bocVar) {
        this.this$0 = adqVar;
        this.val$lifecycle = bocVar;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public int getInterfaceVersion() {
        return 1;
    }

    /* JADX INFO: renamed from: lambda$onStopNavigation$0$androidx-car-app-navigation-NavigationManager$1, reason: not valid java name */
    public /* synthetic */ Object m181xb1216230() {
        afi.a();
        return null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        aag.d(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new aex() { // from class: ado
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m181xb1216230();
            }
        });
    }
}
