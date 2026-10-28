package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bar extends WindowInsetsAnimation$Callback {
    private final bam a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public bar(bam bamVar) {
        super(bamVar.c);
        this.d = new HashMap();
        this.a = bamVar;
    }

    private final ci a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        ci ciVar = (ci) map.get(windowInsetsAnimation);
        if (ciVar != null) {
            return ciVar;
        }
        ci ciVar2 = new ci(windowInsetsAnimation);
        map.put(windowInsetsAnimation, ciVar2);
        return ciVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                bam bamVar = this.a;
                bbn bbnVarO = bbn.o(windowInsets, null);
                bamVar.a(bbnVarO, this.b);
                return bbnVarO.e();
            }
            WindowInsetsAnimation windowInsetsAnimationM34m = aaj$$ExternalSyntheticApiModelOutline0.m34m(list.get(size));
            ci ciVarA = a(windowInsetsAnimationM34m);
            ciVarA.n(windowInsetsAnimationM34m.getFraction());
            this.c.add(ciVarA);
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ci ciVarA = a(windowInsetsAnimation);
        bal balVar = new bal(bounds);
        this.a.b(ciVarA, balVar);
        return new WindowInsetsAnimation.Bounds(balVar.a.a(), balVar.b.a());
    }
}
