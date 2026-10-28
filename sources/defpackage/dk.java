package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class dk extends dts {
    public final dd a;
    public dn b = null;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public cc e = null;
    private boolean f;

    public dk(dd ddVar) {
        this.a = ddVar;
    }

    @Override // defpackage.dts
    public final Parcelable a() {
        Bundle bundle;
        ArrayList arrayList = this.c;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            cb[] cbVarArr = new cb[arrayList.size()];
            arrayList.toArray(cbVarArr);
            bundle.putParcelableArray("states", cbVarArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            cc ccVar = (cc) arrayList2.get(i);
            if (ccVar != null && ccVar.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String str = "f" + i;
                dd ddVar = this.a;
                if (ccVar.mFragmentManager != ddVar) {
                    ddVar.U(new IllegalStateException(a.bV(ccVar, "Fragment ", " is not currently in the FragmentManager")));
                }
                bundle.putString(str, ccVar.mWho);
            }
            i++;
        }
    }

    @Override // defpackage.dts
    public final void b(Parcelable parcelable, ClassLoader classLoader) {
        cc ccVarE;
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.c;
            arrayList.clear();
            ArrayList arrayList2 = this.d;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((cb) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = Integer.parseInt(str.substring(1));
                    dd ddVar = this.a;
                    String string = bundle.getString(str);
                    if (string == null) {
                        ccVarE = null;
                    } else {
                        ccVarE = ddVar.e(string);
                        if (ccVarE == null) {
                            ddVar.U(new IllegalStateException(a.ca(string, str, "Fragment no longer exists for key ", ": unique id ")));
                        }
                    }
                    if (ccVarE != null) {
                        while (arrayList2.size() <= i) {
                            arrayList2.add(null);
                        }
                        ccVarE.setMenuVisibility(false);
                        arrayList2.set(i, ccVarE);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(String.valueOf(str)));
                    }
                }
            }
        }
    }

    @Override // defpackage.dts
    public final void c(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException(a.bV(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.dts
    public final boolean d(View view, Object obj) {
        return ((cc) obj).getView() == view;
    }

    @Override // defpackage.dts
    public final void e() {
        dn dnVar = this.b;
        if (dnVar != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    dnVar.f();
                    this.f = false;
                } catch (Throwable th) {
                    this.f = false;
                    throw th;
                }
            }
            this.b = null;
        }
    }

    @Override // defpackage.dts
    public final void f(Object obj) {
        cc ccVar = (cc) obj;
        cc ccVar2 = this.e;
        if (ccVar != ccVar2) {
            if (ccVar2 != null) {
                ccVar2.setMenuVisibility(false);
                this.e.setUserVisibleHint(false);
            }
            ccVar.setMenuVisibility(true);
            ccVar.setUserVisibleHint(true);
            this.e = ccVar;
        }
    }
}
