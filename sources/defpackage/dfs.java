package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dfs extends ArrayAdapter implements AdapterView.OnItemClickListener {
    private final LayoutInflater a;
    private final Drawable b;
    private final Drawable c;
    private final Drawable d;
    private final Drawable e;

    public dfs(Context context, List list) {
        super(context, 0, list);
        this.a = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.b = dl.d(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        this.c = dl.d(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.d = dl.d(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.e = dl.d(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawableCreateFromStream;
        int i2;
        if (view == null) {
            view = this.a.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
        }
        dii diiVar = (dii) getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
        TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
        textView.setText(diiVar.e);
        String str = diiVar.f;
        int i3 = diiVar.j;
        if ((i3 == 2 || i3 == 1) && !TextUtils.isEmpty(str)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText("");
        }
        view.setEnabled(diiVar.h);
        bac.p(view, dfu.a);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        if (imageView != null) {
            Uri uri = diiVar.g;
            if (uri != null) {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                    if (drawableCreateFromStream == null) {
                        i2 = diiVar.o;
                        if (i2 != 1) {
                            drawableCreateFromStream = this.c;
                        } else if (i2 != 2) {
                            drawableCreateFromStream = this.d;
                        } else if (diiVar.m()) {
                            drawableCreateFromStream = this.e;
                        } else {
                            drawableCreateFromStream = this.b;
                        }
                    }
                } catch (IOException e) {
                    Objects.toString(uri);
                    Log.w("MediaRouteChooserDialog", "Failed to load ".concat(uri.toString()), e);
                }
            } else {
                i2 = diiVar.o;
                if (i2 != 1) {
                    drawableCreateFromStream = this.c;
                } else if (i2 != 2) {
                    drawableCreateFromStream = this.d;
                } else if (diiVar.m()) {
                    drawableCreateFromStream = this.e;
                } else {
                    drawableCreateFromStream = this.b;
                }
            }
            imageView.setImageDrawable(drawableCreateFromStream);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((dii) getItem(i)).h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dii diiVar = (dii) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        diiVar.i(true);
    }
}
