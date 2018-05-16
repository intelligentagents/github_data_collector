package utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.collections.ComparatorUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;

public class Util {

	public static String getUserCommitsPath(String project, String name) {
		String path = getUserPath(project, name) + "commits/";
		checkDirectory(path);
		return path;
	}

	public static String getUserPath(String project, String name) {
		String path = getUsersFolderPath(project) + name + "/";
		checkDirectory(path);
		return path;
	}

	public static void checkDirectory(String path) {
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}
	}

	public static String getUsersFolderPath(String project) {
		String path = LocalPaths.PATH + project + "/users/";
		checkDirectory(path);
		return path;

	}

	public static String getPullsFolder(String project) {
		String path = LocalPaths.PATH + project + "/pulls/";
		checkDirectory(path);
		return path;
	}

	public static String getGeneralPullsFolder(String project) {
		String path = getPullsFolder(project) + "general/";
		checkDirectory(path);
		return path;
	}

	public static String getIndividualPullsFolder(String project) {
		String path = getPullsFolder(project) + "individual/";
		checkDirectory(path);
		return path;
	}

	public static String getCommentsPullsFolder(String project) {
		String path = getPullsFolder(project) + "comments/";
		checkDirectory(path);
		return path;
	}

	public static String getForkFolderPath(String project) {
		String path = LocalPaths.PATH + project + "/forks/";
		checkDirectory(path);
		return path;
	}

	public static List<String> getForksNames(String project) {
		List<String> forksNames = IO.readAnyFile(getForkFolderPath(project) + "forks_names.txt");
		return forksNames;
	}

	public static String getUserBranchPath(String project, String user) {
		String path = getUserPath(project, user) + "branches/";
		checkDirectory(path);
		return path;
	}

	public static String getGeneralIssuesPath(String project) {
		String path = getIssuesPath(project) + "general/";
		checkDirectory(path);
		return path;
	}

	public static String getIssuesPath(String project) {
		String path = LocalPaths.PATH + project + "/issues/";
		checkDirectory(path);
		return path;
	}

	public static String getPullCommitsPath(String project) {
		String path = getPullsFolder(project) + "commits/";
		checkDirectory(path);
		return path;
	}

	public static String getIndividualIssuesFolder(String project) {
		String path = getIssuesPath(project) + "individual/";
		checkDirectory(path);
		return path;
	}

	public static String getIssuesCommentsPath(String project) {
		String path = getIssuesPath(project) + "comments/";
		checkDirectory(path);
		return path;
	}

	public static String getCollaboratorsPath(String project) {
		String path = LocalPaths.PATH + project + "/collaborators/";
		checkDirectory(path);
		return path;
	}

	public static String getCollaboratorsFolderPath(String project) {
		String path = getCollaboratorsPath(project) + "all/";
		checkDirectory(path);
		return path;
	}

	public static String getCommitsFolderPath(String project) {
		String path = getCommitsPath(project) + "all/";
		checkDirectory(path);
		return path;
	}

	public static String getCommitsPath(String project) {
		String path = LocalPaths.PATH + project + "/commits/";
		checkDirectory(path);
		return path;
	}

	public static String getIndividualCommitsPath(String project) {
		String path = getCommitsPath(project) + "individual/";
		checkDirectory(path);
		return path;
	}

	public static String getCommitCommentsFolder(String project) {
		String path = getCommitsPath(project) + "comments/";
		checkDirectory(path);
		return path;
	}

	public static String getCommitCommentsGeneralFolder(String project) {
		String path = getCommitCommentsFolder(project) + "general/";
		checkDirectory(path);
		return path;
	}

	public static String getIndividualCommitCommentsFolder(String project) {
		String path = getCommitCommentsFolder(project) + "individual/";
		checkDirectory(path);
		return path;
	}

	
	public static String getPullIndividualCommitsPath(String project) {
		String path = getPullCommitsPath(project) + "individual/";
		checkDirectory(path);
		return path;
	}

	public static String getMetricsPath(String project) {
		String path = LocalPaths.PATH + project + "/metrics/";
		checkDirectory(path);
		return path;
	}

}
