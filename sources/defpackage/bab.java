package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bab {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    private SparseArray d = null;
    public WeakReference c = null;

    static bab c(View view) {
        bab babVar = (bab) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (babVar != null) {
            return babVar;
        }
        bab babVar2 = new bab();
        view.setTag(R.id.tag_unhandled_key_event_manager, babVar2);
        return babVar2;
    }

    public static final boolean d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            int size = arrayList.size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!((baa) arrayList.get(size)).a());
            return true;
        }
        return false;
    }

    public final SparseArray a() {
        SparseArray sparseArray = this.d;
        if (sparseArray != null) {
            return sparseArray;
        }
        SparseArray sparseArray2 = new SparseArray();
        this.d = sparseArray2;
        return sparseArray2;
    }

    public final View b(View view, KeyEvent keyEvent) {
        View viewB;
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        viewB = b(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (viewB == null);
                return viewB;
            }
            if (d(view)) {
                return view;
            }
        }
        return null;
    }
}
