package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gff extends nh {
    public Cursor a;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public long j = -1;
    public final qcb k;
    private final qcb l;

    public gff(qcb qcbVar, qcb qcbVar2) {
        this.k = qcbVar;
        this.l = qcbVar2;
    }

    @Override // defpackage.nh
    public final int a() {
        Cursor cursor = this.a;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return new gfe(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.music_picker_item, viewGroup, false));
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        gfe gfeVar = (gfe) ohVar;
        Cursor cursor = this.a;
        if (cursor == null || !cursor.moveToPosition(i)) {
            return;
        }
        Context context = gfeVar.a.getContext();
        gff gffVar = gfeVar.x;
        Cursor cursor2 = gffVar.a;
        if (cursor2 != null) {
            int i2 = cursor2.getInt(gffVar.i);
            if (i2 == 0) {
                gfeVar.v.setText("");
            } else {
                gfeVar.v.setText(nsj.c(Duration.ofMillis(i2).toSeconds()));
            }
            gfeVar.s.setText(cursor2.getString(gffVar.f));
            String string = cursor2.getString(gffVar.h);
            if (string == null || string.equals("<unknown>")) {
                string = context.getString(R.string.unknown_album);
            }
            gfeVar.t.setText(string);
            String string2 = cursor2.getString(gffVar.g);
            if (string2 == null || string2.equals("<unknown>")) {
                string2 = context.getString(R.string.unknown_artist);
            }
            gfeVar.u.setText(string2);
            gfeVar.w.setChecked(cursor2.getLong(gffVar.e) == gffVar.j);
        }
    }

    public final void z(Cursor cursor) {
        this.a = cursor;
        if (cursor != null) {
            this.e = cursor.getColumnIndex("_id");
            this.f = this.a.getColumnIndex("title");
            this.g = this.a.getColumnIndex("artist");
            this.h = this.a.getColumnIndex("album");
            this.i = this.a.getColumnIndex("duration");
            j(0, a());
        }
        gfb gfbVar = (gfb) this.l.a;
        if (gfbVar.k) {
            return;
        }
        gfbVar.k = true;
        View view = gfbVar.i;
        if (view != null) {
            view.startAnimation(AnimationUtils.loadAnimation(gfbVar.b, android.R.anim.fade_out));
            gfbVar.i.setVisibility(8);
        }
        View view2 = gfbVar.j;
        if (view2 != null) {
            view2.startAnimation(AnimationUtils.loadAnimation(gfbVar.b, android.R.anim.fade_in));
            gfbVar.j.setVisibility(0);
        }
    }
}
