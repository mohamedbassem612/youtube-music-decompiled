package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class qnv extends ArrayAdapter {
    public qnv(Context context) {
        super(context, R.layout.bottom_sheet_list_item);
    }

    protected Object a(int i, View view) {
        qnx qnxVar = (qnx) getItem(i);
        if (qnxVar instanceof qny) {
            return new xsc(view);
        }
        if (qnxVar instanceof qnz) {
            return null;
        }
        throw new IllegalStateException("Unsupported item: ".concat(String.valueOf(qnxVar.getClass().getSimpleName())));
    }

    protected void b(int i, Object obj) {
        qnx qnxVar = (qnx) getItem(i);
        if (!(qnxVar instanceof qny)) {
            if (!(qnxVar instanceof qnz)) {
                throw new IllegalStateException("Unsupported item: ".concat(String.valueOf(qnxVar.getClass().getSimpleName())));
            }
            return;
        }
        qny qnyVar = (qny) qnxVar;
        xsc xscVar = (xsc) obj;
        TextView textView = (TextView) xscVar.a;
        textView.setText(qnyVar.d);
        ColorStateList colorStateList = qnyVar.e;
        if (colorStateList == null) {
            colorStateList = getContext().getResources().getColorStateList(R.color.quantum_black_text);
        }
        textView.setTextColor(colorStateList);
        Drawable drawable = qnyVar.f;
        if (drawable == null) {
            ((ImageView) xscVar.b).setVisibility(8);
        } else {
            ImageView imageView = (ImageView) xscVar.b;
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        Drawable drawable2 = qnyVar.g;
        if (drawable2 == null) {
            ((ImageView) xscVar.c).setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) xscVar.c;
        imageView2.setImageDrawable(drawable2);
        imageView2.setVisibility(0);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i) instanceof qny ? 0 : 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        qnx qnxVar = (qnx) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(qnxVar.b(), viewGroup, false);
            view.setTag(a(i, view));
        }
        b(i, view.getTag());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((qnx) getItem(i)).c();
    }
}
