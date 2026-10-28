package defpackage;

import android.graphics.Bitmap;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class oaa implements FrameSequenceDrawable.BitmapProvider, ewf {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final FrameSequence b;
    private final ewn c;
    private final LinkedList d = new LinkedList();

    public oaa(FrameSequence frameSequence, ewn ewnVar) {
        this.b = frameSequence;
        this.c = ewnVar;
    }

    @Override // defpackage.ewf
    public final int a() {
        FrameSequence frameSequence = this.b;
        return (int) (((double) (frameSequence.getWidth() * frameSequence.getHeight())) * ((((double) frameSequence.getFrameCount()) * 0.06d) + 16.0d));
    }

    @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
    public final Bitmap acquireBitmap(int i, int i2) {
        return this.c.a(i, i2, a);
    }

    @Override // defpackage.ewf
    public final Class b() {
        return FrameSequenceDrawable.class;
    }

    @Override // defpackage.ewf
    public final /* bridge */ /* synthetic */ Object c() {
        FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(this.b, this);
        this.d.add(frameSequenceDrawable);
        return frameSequenceDrawable;
    }

    @Override // defpackage.ewf
    public final void e() {
        while (true) {
            LinkedList linkedList = this.d;
            if (linkedList.isEmpty()) {
                return;
            }
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) linkedList.poll();
            if (!frameSequenceDrawable.isDestroyed()) {
                frameSequenceDrawable.destroy();
            }
        }
    }

    @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
    public final void releaseBitmap(Bitmap bitmap) {
        this.c.d(bitmap);
    }
}
