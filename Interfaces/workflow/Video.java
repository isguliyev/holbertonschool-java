public class Video {
	private String file;
	private FormatVideo formatvideo;

	public Video(String file, FormatVideo formatvideo) {
		setFile(file);
		setFormatVideo(formatvideo);
	}

	public String getFile() {
		return this.file;
	}

	public FormatVideo getFormatVideo() {
		return this.formatvideo;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setFormatVideo(FormatVideo formatvideo) {
		this.formatvideo = formatvideo;
	}
}