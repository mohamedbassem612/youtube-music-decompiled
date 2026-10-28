package defpackage;

import androidx.car.app.navigation.INavigationManager;
import androidx.car.app.navigation.NavigationManager$1;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adq implements za {
    public final INavigationManager.Stub a;

    public adq(boc bocVar) {
        this.a = new NavigationManager$1(this, bocVar);
        bocVar.b(new adp(bocVar, 0));
    }
}
