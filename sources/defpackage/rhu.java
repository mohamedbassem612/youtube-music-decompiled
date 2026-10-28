package defpackage;

import android.util.Size;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.EventManager;
import com.google.research.xeno.effect.InputFrameSource;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface rhu extends ahxl, ahxk {
    agke a();

    void c();

    void d(agke agkeVar, Callbacks$StatusCallback callbacks$StatusCallback);

    void e(InputFrameSource inputFrameSource, Size size);

    void f();

    EventManager g();

    void h(TextureFrame textureFrame, long j);

    void i(atur aturVar);

    void j(atus atusVar);

    void k(Callbacks$StatusCallback callbacks$StatusCallback);
}
