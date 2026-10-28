package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum apsd implements aihr {
    SFV_EFFECT_SURFACE_UNKNOWN(0),
    SFV_EFFECT_SURFACE_CAMERA(1),
    SFV_EFFECT_SURFACE_EDITOR(2),
    SFV_EFFECT_SURFACE_RECOMPOSITION(3),
    SFV_EFFECT_SURFACE_EXPORT_SESSION(4),
    SFV_EFFECT_SURFACE_UPLOAD_TRANSCODE(5),
    SFV_EFFECT_SURFACE_AUDIO_UPLOAD_TRANSCODE(6),
    SFV_EFFECT_SURFACE_CLIP_TRIM(7),
    SFV_EFFECT_SURFACE_DENOISE(8),
    SFV_EFFECT_SURFACE_MEDIAGEN(9),
    SFV_EFFECT_SURFACE_LICENSED_MUSIC_TRANSMUX(10),
    SFV_EFFECT_SURFACE_VIDEO_REVERSE(11),
    SFV_EFFECT_SURFACE_IMPORT(12),
    SFV_EFFECT_SURFACE_EDITOR_SAVE_TO_DEVICE(13),
    SFV_EFFECT_SURFACE_AI_MONTAGE_PREPROCESS(14);

    public final int p;

    apsd(int i) {
        this.p = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
