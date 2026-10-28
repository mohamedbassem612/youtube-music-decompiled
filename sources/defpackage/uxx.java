package defpackage;

import android.content.Context;
import android.database.DataSetObservable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxx extends DataSetObservable {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/deprecated/picker/FilterList");
    public final int b;
    public String c;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    private final Map f;

    public uxx(Context context, int i) {
        context.getClass();
        new TreeMap();
        new TreeMap();
        this.f = new TreeMap();
        this.c = "NORMAL";
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.b = displayMetrics.widthPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.edit_filter_text_selected_alpha_value, typedValue, true);
        typedValue.getFloat();
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(R.dimen.edit_filter_text_unselected_alpha_value, typedValue2, true);
        typedValue2.getFloat();
        if (i != R.layout.choose_filter_list_item_camera && i != R.layout.choose_filter_list_item_camera_preset && i != R.layout.choose_filter_list_item_shorts_camera_preset) {
            context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_selected_thumbnail_size);
            context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_unselected_thumbnail_size);
            context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_first_last_item_margin);
            return;
        }
        context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_selected_thumbnail_size);
        context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_unselected_thumbnail_size);
        context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_first_last_item_margin);
        context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_item_outline_width);
        if (i == R.layout.choose_filter_list_item_shorts_camera_preset) {
            tzk.n(context, R.attr.ytTextPrimary).orElse(0);
        } else {
            tzk.n(context, R.attr.ytOverlayTextPrimary).orElse(0);
        }
    }

    public final View a(String str) {
        return (View) this.f.get(str);
    }

    public final boolean b() {
        return !this.d.isEmpty();
    }

    public final boolean c(String str) {
        return uxp.e(this.c, str);
    }
}
