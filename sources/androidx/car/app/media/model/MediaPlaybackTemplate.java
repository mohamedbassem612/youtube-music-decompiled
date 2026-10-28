package androidx.car.app.media.model;

import androidx.car.app.model.Banner;
import androidx.car.app.model.Header;
import defpackage.acz;
import defpackage.yf;
import defpackage.zj;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class MediaPlaybackTemplate implements acz {
    private final Banner mBanner;
    private final Header mHeader;
    private final MediaPlaybackStyle mStyle;

    MediaPlaybackTemplate(zj zjVar) {
        Object obj = zjVar.a;
        this.mHeader = null;
        Object obj2 = zjVar.b;
        this.mBanner = null;
        Object obj3 = zjVar.c;
        this.mStyle = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaPlaybackTemplate) {
            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
            if (Objects.equals(this.mHeader, mediaPlaybackTemplate.mHeader) && Objects.equals(this.mBanner, mediaPlaybackTemplate.mBanner) && Objects.equals(this.mStyle, mediaPlaybackTemplate.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public Banner getBanner() {
        return this.mBanner;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public MediaPlaybackStyle getStyle() {
        return this.mStyle;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mBanner, this.mStyle);
    }

    public String toString() {
        return "MediaPlaybackTemplate";
    }

    private MediaPlaybackTemplate() {
        this.mHeader = null;
        this.mBanner = null;
        this.mStyle = null;
    }
}
