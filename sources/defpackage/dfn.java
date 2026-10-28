package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dfn extends AsyncTask {
    final /* synthetic */ dfo a;
    private final int b;
    private final Context c;

    public dfn(dfo dfoVar, int i, Context context) {
        this.a = dfoVar;
        this.b = i;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onCancelled(Drawable drawable) {
        if (drawable != null) {
            dfo.a.put(this.b, drawable.getConstantState());
        }
        this.a.h = null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = dfo.a;
        int i = this.b;
        if (((Drawable.ConstantState) sparseArray.get(i)) != null) {
            return null;
        }
        return ok.e().c(this.c, i);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawableNewDrawable = (Drawable) obj;
        if (drawableNewDrawable != null) {
            onCancelled(drawableNewDrawable);
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) dfo.a.get(this.b);
            if (constantState != null) {
                drawableNewDrawable = constantState.newDrawable();
            }
            this.a.h = null;
        }
        this.a.c(drawableNewDrawable);
    }
}
