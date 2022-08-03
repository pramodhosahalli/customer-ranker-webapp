<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en" class="light-style layout-menu-fixed"  dir="ltr"
	  data-theme="theme-default"
	  data-assets-path="../assets/"
	  data-template="vertical-menu-template-free">

<head>
	<meta charset="utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"/>

	<title>Customer Analytics Dashboard</title>

	<meta name="description" content=""/>

	<!-- Favicon -->
	<link rel="icon" type="image/x-icon" href="../assets/img/favicon/favicon.ico"/>

	<!-- Fonts -->
	<link rel="preconnect" href="https://fonts.googleapis.com"/>
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin/>
	<link href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
		  rel="stylesheet"/>

	<!-- Icons. Uncomment required icon fonts -->
	<link rel="stylesheet" href="../assets/vendor/fonts/boxicons.css"/>

	<!-- Core CSS -->
	<link rel="stylesheet" href="../assets/vendor/css/core.css" class="template-customizer-core-css"/>
	<link rel="stylesheet" href="../assets/vendor/css/theme-default.css" class="template-customizer-theme-css"/>
	<link rel="stylesheet" href="../assets/css/demo.css"/>

	<!-- Vendors CSS -->
	<link rel="stylesheet" href="../assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css"/>
	<link rel="stylesheet" href="../assets/vendor/libs/apex-charts/apex-charts.css"/>

	<!-- Page CSS -->
	<style type="text/css">
		html {
			box-sizing: border-box;
		}

		body {
			display: flex;
		}

		*,
		*::before,
		*::after {
			box-sizing: inherit;
		}

		.quiz-medal {
			margin: 7px 0 0 7px;
		}

		.quiz-medal {
			position: relative;
			margin-bottom: 16px;
		}

		.quiz-medal__circle {
			font-family: "Roboto", sans-serif;
			font-size: 28px;
			font-weight: 500;
			width: 56px;
			height: 56px;
			border-radius: 100%;
			color: white;
			text-align: center;
			line-height: 46px;
			vertical-align: middle;
			position: relative;
			border-width: 0.2em;
			border-style: solid;
			z-index: 1;
			box-shadow: inset 0 0 0 #a7b2b8, 2px 2px 0 rgba(0, 0, 0, 0.08);
			border-color: #edeff1;
			text-shadow: 2px 2px 0 #98a6ad;
			background: linear-gradient(to bottom right, #d1d7da 50%, #c3cbcf 50%);
		}
		.quiz-medal__circle.quiz-medal__circle--gold {
			box-shadow: inset 0 0 0 #b67d05, 2px 2px 0 rgba(0, 0, 0, 0.08);
			border-color: #fadd40;
			text-shadow: 0 0 4px #9d6c04;
			background: linear-gradient(to bottom right, #f9ad0e 50%, #e89f06 50%);
		}
		.quiz-medal__circle.quiz-medal__circle--silver {
			box-shadow: inset 0 0 0 #a7b2b8, 2px 2px 0 rgba(0, 0, 0, 0.08);
			border-color: #edeff1;
			text-shadow: 0px 0px 4px #98a6ad;
			background: linear-gradient(to bottom right, #d1d7da 50%, #c3cbcf 50%);
		}
		.quiz-medal__circle.quiz-medal__circle--bronze {
			box-shadow: inset 0 0 0 #955405, 2px 2px 0 rgba(0, 0, 0, 0.08);
			border-color: #f7bb23;
			text-shadow: 0 0 4px #7d4604;
			background: linear-gradient(to bottom right, #df7e08 50%, #c67007 50%);
		}

		.quiz-medal__ribbon {
			content: "";
			display: block;
			position: absolute;
			border-style: solid;
			border-width: 6px 10px;
			width: 0;
			height: 20px;
			top: 50px;
		}

		.quiz-medal__ribbon--left {
			border-color: #fc402d #fc402d transparent #fc402d;
			left: 8px;
			transform: rotate(20deg) translateZ(-32px);
		}

		.quiz-medal__ribbon--right {
			left: 28px;
			border-color: #f31903 #f31903 transparent #f31903;
			transform: rotate(-20deg) translateZ(-48px);
		}

		.card {
			box-shadow: 0 8px 6px 0 rgb(67 89 113 / 12%);
		}

	</style>

	<!-- Helpers -->
	<script src="../assets/vendor/js/helpers.js"></script>
	<script src="../assets/js/config.js"></script>
</head>

<body>
<!-- Layout wrapper -->
<div class="layout-wrapper layout-content-navbar">
	<div class="layout-container">
		<!-- Menu -->

		<aside id="layout-menu" class="layout-menu menu-vertical menu bg-menu-theme">
			<div class="app-brand demo">
				<a href="/" class="app-brand-link">
              <span class="app-brand-logo demo">
                <svg
						width="25"
						viewBox="0 0 25 42"
						version="1.1"
						xmlns="http://www.w3.org/2000/svg"
						xmlns:xlink="http://www.w3.org/1999/xlink"
				>
                  <defs>
                    <path
							d="M13.7918663,0.358365126 L3.39788168,7.44174259 C0.566865006,9.69408886 -0.379795268,12.4788597 0.557900856,15.7960551 C0.68998853,16.2305145 1.09562888,17.7872135 3.12357076,19.2293357 C3.8146334,19.7207684 5.32369333,20.3834223 7.65075054,21.2172976 L7.59773219,21.2525164 L2.63468769,24.5493413 C0.445452254,26.3002124 0.0884951797,28.5083815 1.56381646,31.1738486 C2.83770406,32.8170431 5.20850219,33.2640127 7.09180128,32.5391577 C8.347334,32.0559211 11.4559176,30.0011079 16.4175519,26.3747182 C18.0338572,24.4997857 18.6973423,22.4544883 18.4080071,20.2388261 C17.963753,17.5346866 16.1776345,15.5799961 13.0496516,14.3747546 L10.9194936,13.4715819 L18.6192054,7.984237 L13.7918663,0.358365126 Z"
							id="path-1"
					></path>
                    <path
							d="M5.47320593,6.00457225 C4.05321814,8.216144 4.36334763,10.0722806 6.40359441,11.5729822 C8.61520715,12.571656 10.0999176,13.2171421 10.8577257,13.5094407 L15.5088241,14.433041 L18.6192054,7.984237 C15.5364148,3.11535317 13.9273018,0.573395879 13.7918663,0.358365126 C13.5790555,0.511491653 10.8061687,2.3935607 5.47320593,6.00457225 Z"
							id="path-3"
					></path>
                    <path
							d="M7.50063644,21.2294429 L12.3234468,23.3159332 C14.1688022,24.7579751 14.397098,26.4880487 13.008334,28.506154 C11.6195701,30.5242593 10.3099883,31.790241 9.07958868,32.3040991 C5.78142938,33.4346997 4.13234973,34 4.13234973,34 C4.13234973,34 2.75489982,33.0538207 2.37032616e-14,31.1614621 C-0.55822714,27.8186216 -0.55822714,26.0572515 -4.05231404e-15,25.8773518 C0.83734071,25.6075023 2.77988457,22.8248993 3.3049379,22.52991 C3.65497346,22.3332504 5.05353963,21.8997614 7.50063644,21.2294429 Z"
							id="path-4"
					></path>
                    <path
							d="M20.6,7.13333333 L25.6,13.8 C26.2627417,14.6836556 26.0836556,15.9372583 25.2,16.6 C24.8538077,16.8596443 24.4327404,17 24,17 L14,17 C12.8954305,17 12,16.1045695 12,15 C12,14.5672596 12.1403557,14.1461923 12.4,13.8 L17.4,7.13333333 C18.0627417,6.24967773 19.3163444,6.07059163 20.2,6.73333333 C20.3516113,6.84704183 20.4862915,6.981722 20.6,7.13333333 Z"
							id="path-5"
					></path>
                  </defs>
                  <g id="g-app-brand" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                    <g id="Brand-Logo" transform="translate(-27.000000, -15.000000)">
                      <g id="Icon" transform="translate(27.000000, 15.000000)">
                        <g id="Mask" transform="translate(0.000000, 8.000000)">
                          <mask id="mask-2" fill="white">
                            <use xlink:href="#path-1"></use>
                          </mask>
                          <use fill="#696cff" xlink:href="#path-1"></use>
                          <g id="Path-3" mask="url(#mask-2)">
                            <use fill="#696cff" xlink:href="#path-3"></use>
                            <use fill-opacity="0.2" fill="#FFFFFF" xlink:href="#path-3"></use>
                          </g>
                          <g id="Path-4" mask="url(#mask-2)">
                            <use fill="#696cff" xlink:href="#path-4"></use>
                            <use fill-opacity="0.2" fill="#FFFFFF" xlink:href="#path-4"></use>
                          </g>
                        </g>
                        <g
								id="Triangle"
								transform="translate(19.000000, 11.000000) rotate(-300.000000) translate(-19.000000, -11.000000) "
						>
                          <use fill="#696cff" xlink:href="#path-5"></use>
                          <use fill-opacity="0.2" fill="#FFFFFF" xlink:href="#path-5"></use>
                        </g>
                      </g>
                    </g>
                  </g>
                </svg>
              </span>
					<span class="app-brand-text demo menu-text fw-bolder ms-2"
						  style="text-transform: none; font-size:1.25rem;">Amazon Music</span>
				</a>

				<a href="javascript:void(0);" class="layout-menu-toggle menu-link text-large ms-auto d-block d-xl-none">
					<i class="bx bx-chevron-left bx-sm align-middle"></i>
				</a>
			</div>

			<div class="menu-inner-shadow"></div>

			<ul class="menu-inner py-1">
				<!-- Dashboard -->
				<li class="menu-item active">
					<a href="/" class="menu-link">
						<i class="menu-icon tf-icons bx bx-home-circle"></i>
						<div data-i18n="Analytics">Dashboard</div>
					</a>
				</li>

				<!-- Tables -->
				<li class="menu-item">
					<a href="/leaderboard" class="menu-link">
						<i class="menu-icon tf-icons bx bx-table"></i>
						<div data-i18n="Tables">Leaderboard Results</div>
					</a>
				</li>
				<li class="menu-item">
					<a href="javascript:void(0);" class="menu-link menu-toggle">
						<i class="menu-icon tf-icons bx bx-dock-top"></i>
						<div data-i18n="Account Settings">Account Settings</div>
					</a>
					<ul class="menu-sub">
						<li class="menu-item">
							<a href="/account_settings_account" class="menu-link">
								<div data-i18n="Account">Account</div>
							</a>
						</li>
						<li class="menu-item">
							<a href="/account_settings_notify" class="menu-link">
								<div data-i18n="Notifications">Notifications</div>
							</a>
						</li>
						<li class="menu-item">
							<a href="/account_settings_conn" class="menu-link">
								<div data-i18n="Connections">Connections</div>
							</a>
						</li>
					</ul>
				</li>


				<!-- Misc -->
				<li class="menu-header small text-uppercase"><span class="menu-header-text">Misc</span></li>
				<li class="menu-item">
					<a
							href="#"
							target="_blank"
							class="menu-link"
					>
						<i class="menu-icon tf-icons bx bx-support"></i>
						<div data-i18n="Support">Support</div>
					</a>
				</li>
				<li class="menu-item">
					<a
							href="#"
							target="_blank"
							class="menu-link"
					>
						<i class="menu-icon tf-icons bx bx-file"></i>
						<div data-i18n="Documentation">Documentation</div>
					</a>
				</li>

			</ul>
		</aside>
		<!-- / Menu -->

		<!-- Layout container -->
		<div class="layout-page">
			<!-- Navbar -->

			<nav
					class="layout-navbar container-xxl navbar navbar-expand-xl navbar-detached align-items-center bg-navbar-theme"
					id="layout-navbar"
			>
				<div class="layout-menu-toggle navbar-nav align-items-xl-center me-3 me-xl-0 d-xl-none">
					<a class="nav-item nav-link px-0 me-xl-4" href="javascript:void(0)">
						<i class="bx bx-menu bx-sm"></i>
					</a>
				</div>

				<div class="navbar-nav-right d-flex align-items-center" id="navbar-collapse">
					<!-- Search -->
					<div class="navbar-nav align-items-center">
						<div class="nav-item d-flex align-items-center">
							<i class="bx bx-search fs-4 lh-0"></i>
							<input
									type="text"
									class="form-control border-0 shadow-none"
									placeholder="Search..."
									aria-label="Search..."
							/>
						</div>
					</div>
					<!-- /Search -->

					<ul class="navbar-nav flex-row align-items-center ms-auto">
						<!-- Place this tag where you want the button to render. -->
						<li class="nav-item lh-1 me-3">
							<a
									class="github-button"
									href="https://github.com/themeselection/sneat-html-admin-template-free"
									data-icon="octicon-star"
									data-size="large"
									data-show-count="true"
									aria-label="Star themeselection/sneat-html-admin-template-free on GitHub"
							>Followers</a
							>
						</li>

						<!-- User -->
						<li class="nav-item navbar-dropdown dropdown-user dropdown">
							<a class="nav-link dropdown-toggle hide-arrow" href="javascript:void(0);"
							   data-bs-toggle="dropdown">
								<div class="avatar avatar-online">
									<img src="../assets/img/avatars/1.png" alt class="w-px-40 h-auto rounded-circle"/>
								</div>
							</a>
							<ul class="dropdown-menu dropdown-menu-end">
								<li>
									<a class="dropdown-item" href="#">
										<div class="d-flex">
											<div class="flex-shrink-0 me-3">
												<div class="avatar avatar-online">
													<img src="../assets/img/avatars/1.png" alt
														 class="w-px-40 h-auto rounded-circle"/>
												</div>
											</div>
											<div class="flex-grow-1">
												<span class="fw-semibold d-block">${username}</span>
												<small class="text-muted"></small>
											</div>
										</div>
									</a>
								</li>
								<li>
									<div class="dropdown-divider"></div>
								</li>
								<li>
									<a class="dropdown-item" href="#">
										<i class="bx bx-user me-2"></i>
										<span class="align-middle">My Profile</span>
									</a>
								</li>
								<li>
									<a class="dropdown-item" href="#">
										<i class="bx bx-cog me-2"></i>
										<span class="align-middle">Settings</span>
									</a>
								</li>
								<li>
									<a class="dropdown-item" href="#">
                        <span class="d-flex align-items-center align-middle">
                          <i class="flex-shrink-0 bx bx-credit-card me-2"></i>
                          <span class="flex-grow-1 align-middle">Billing</span>
                          <span class="flex-shrink-0 badge badge-center rounded-pill bg-danger w-px-20 h-px-20">4</span>
                        </span>
									</a>
								</li>
								<li>
									<div class="dropdown-divider"></div>
								</li>
								<li>
									<a class="dropdown-item" href="auth-login-basic.html">
										<i class="bx bx-power-off me-2"></i>
										<span class="align-middle">Log Out</span>
									</a>
								</li>
							</ul>
						</li>
						<!--/ User -->
					</ul>
				</div>
			</nav>

			<!-- / Navbar -->

			<!-- Content wrapper -->
			<div class="content-wrapper">
				<!-- Content -->

				<div class="container-xxl flex-grow-1 container-p-y">
					<div class="row">
						<div class="col-lg-8 mb-4 order-0">
							<div class="card">
								<div class="d-flex align-items-end row">
									<div class="col-sm-7">
										<div class="card-body">
											<h5 class="card-title text-primary">Congratulations ${username}! 🎉</h5>
											<p class="mb-4">
												You have done <span class="fw-bold">72%</span> more sales today. Check
												your new badge in
												your profile.
											</p>

											<a href="javascript:;" class="btn btn-sm btn-outline-primary">View
												Badges</a>
										</div>
									</div>
									<div class="col-sm-5 text-center text-sm-left">
										<div class="card-body pb-0 px-0 px-md-4">
											<img
													src="../assets/img/illustrations/man-with-laptop-light.png"
													height="140"
													alt="View Badge User"
													data-app-dark-img="illustrations/man-with-laptop-dark.png"
													data-app-light-img="illustrations/man-with-laptop-light.png"
											/>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-md-4 order-1">
							<div class="row">
								<div class="col-12 mb-4">
									<div class="card">
										<div class="card-body">
											<div class="d-flex justify-content-between flex-sm-row flex-column gap-3">
												<div class="d-flex flex-sm-column flex-row align-items-start justify-content-between">
													<div class="card-title">
														<h5 class="text-nowrap mb-2 text-primary">&nbsp;&nbsp;&nbsp;Rank</h5>
														<div class="quiz-medal">
															<div class="quiz-medal__circle quiz-medal__circle--gold">
                                                                <span>
                                                                  ${rank}&nbsp;
                                                                </span>
															</div>
															<div class="quiz-medal__ribbon quiz-medal__ribbon--left"></div>
															<div class="quiz-medal__ribbon quiz-medal__ribbon--right"></div>
														</div>
														<br/>
														<span class="badge bg-success rounded-pill">${timespan}</span>
													</div>

												</div>
												<div id="profileReportChart"></div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- Total Revenue -->
						<div class="col-12 col-lg-8 order-2 order-md-3 order-lg-2 mb-4">
							<div class="row">
								<!-- Order Statistics -->
								<div class="col-md-6 col-lg-6 col-xl-6 order-0 mb-4">
									<div class="card h-100">
										<div class="card-header d-flex align-items-center justify-content-between pb-0">
											<div class="card-title mb-0">
												<h5 class="m-0 me-2 text-primary">Monthly Usage Summary</h5>
												<small class="text-muted">${totalSongsListened} Songs Listened</small>
											</div>
											<div class="dropdown">
												<button
														class="btn p-0"
														type="button"
														id="orederStatistics"
														data-bs-toggle="dropdown"
														aria-haspopup="true"
														aria-expanded="false"
												>
													<i class="bx bx-dots-vertical-rounded"></i>
												</button>
												<div class="dropdown-menu dropdown-menu-end"
													 aria-labelledby="orederStatistics">
													<a class="dropdown-item" href="javascript:void(0);">Select All</a>
													<a class="dropdown-item" href="javascript:void(0);">Refresh</a>
													<a class="dropdown-item" href="javascript:void(0);">Share</a>
												</div>
											</div>
										</div>
										<div class="card-body">
											<div class="d-flex justify-content-between align-items-center mb-3">
												<div class="d-flex flex-column align-items-center gap-1">
													<h2 class="mb-2">${totalSongsListened}</h2>
													<span>Total Songs</span>
												</div>
												<div id="orderStatisticsChart"></div>
											</div>
											<ul class="p-0 m-0">
												<c:forEach items="${languageGroupedContents}" var="entry">
													<li class="d-flex mb-4 pb-1">
														<div class="avatar flex-shrink-0 me-3">
                                                        <span class="avatar-initial rounded bg-label-warning"><i
																class="bx bx-closet"></i></span>
														</div>
														<div class="d-flex w-100 flex-wrap align-items-center justify-content-between gap-2">
															<div class="me-2">
																<h6 class="mb-0">${entry.key}</h6>
																<c:if test="${entry.key == 'Hindi'}">
																	<small class="text-muted">Kumar Sonu, Alka Yagnik, Kishor Kumar</small>
																</c:if>
																<c:if test="${entry.key == 'Kannada'}">
																	<small class="text-muted">Sonu Nigam, SP Balasubramanyam</small>
																</c:if>
																<c:if test="${entry.key == 'Telugu'}">
																	<small class="text-muted">Sid Sriram, Shreya Ghoshal</small>
																</c:if>
																<c:if test="${entry.key == 'Tamil'}">
																	<small class="text-muted">Sonu Nigam, Hariharan</small>
																</c:if>
															</div>
															<div class="user-progress">
																<small class="fw-semibold">${entry.value}
																	<small class="text-success fw-semibold">
																		<i class="bx bx-chevron-up"></i>
																		12.9%
																	</small>
																</small>
															</div>
														</div>
													</li>
												</c:forEach>
											</ul>
										</div>
									</div>
								</div>
								<!--/ Order Statistics -->

								<!-- Expense Overview -->
								<div class="col-md-6 col-lg-6 order-1 mb-4">
									<div class="card h-100">
										<div class="card-header d-flex align-items-center justify-content-between pb-0">
										<div class="card-title mb-0">
											<h5 class="m-0 me-2 text-primary">Last 6 Months Summary</h5>
											<small class="text-muted">${totalSongsListened} Songs Listened</small>
											<small class="text-success fw-semibold">
												<i class="bx bx-chevron-up"></i>
												42.9%
											</small>
										</div>
										</div>
										<div class="card-body px-0">
											<div class="tab-content p-0">
												<div class="tab-pane fade show active" id="navs-tabs-line-card-income"
													 role="tabpanel">
													<div id="incomeChart"></div>
													<div class="d-flex justify-content-center pt-4 gap-2">
														<div class="flex-shrink-0">
															<div id="expensesOfWeek"></div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!--/ Expense Overview -->

							</div>
						</div>
						<!--/ Total Revenue -->
						<div class="col-12 col-md-8 col-lg-4 order-3 order-md-2">
							<div class="row">

								<!-- Transactions -->
								<div class="col-md-12 col-lg-12 order-2 mb-4">
									<div class="card h-100">
										<div class="card-header d-flex align-items-center justify-content-between">
											<h5 class="card-title m-0 me-2 text-primary">Top Visited Songs</h5>
											<div class="dropdown">
												<button
														class="btn p-0"
														type="button"
														id="transactionID"
														data-bs-toggle="dropdown"
														aria-haspopup="true"
														aria-expanded="false"
												>
													<i class="bx bx-dots-vertical-rounded"></i>
												</button>
												<div class="dropdown-menu dropdown-menu-end"
													 aria-labelledby="transactionID">
													<a class="dropdown-item" href="javascript:void(0);">Last Month</a>
													<a class="dropdown-item" href="javascript:void(0);">Last Year</a>
												</div>
											</div>
										</div>
										<div class="card-body">
											<ul class="p-0 m-0">
												<c:forEach items="${mostWatchedContents}" var="entry" begin="0" end="5" step="1">
													<li class="d-flex mb-4 pb-1">
														<div class="avatar flex-shrink-0 me-3">
															<img src="../assets/img/icons/unicons/paypal.png" alt="User"
																 class="rounded"/>
														</div>
														<div class="d-flex w-100 flex-wrap align-items-center justify-content-between gap-2">
															<div class="me-2">
																<h6 class="mb-0" style="color:green;">${entry.key.contentName}</h6>
																<small class="text-muted d-block mb-1">${entry.key.contentLen}</small>
															</div>
															<div class="user-progress d-flex align-items-center gap-1">
																<h6 class="mb-0">${entry.value}</h6>
																<span class="text-muted"> hits</span>
															</div>
														</div>
													</li>
												</c:forEach>
											</ul>
										</div>
									</div>
								</div>
								<!--/ Transactions -->

							</div>
						</div>

					</div>

					<div>
						<h5 class="m-0 me-2 text-primary">Recommendations For You</h5><br/>
					</div>
					<div class="row">
						<div
								id="carouselExample-cf"
								class="carousel carousel-dark slide carousel-fade"
								data-bs-ride="carousel"
						>
							<ol class="carousel-indicators" style="margin-bottom: -1rem;">
								<li data-bs-target="#carouselExample-cf" data-bs-slide-to="0" class="active"></li>
								<li data-bs-target="#carouselExample-cf" data-bs-slide-to="1"></li>
								<li data-bs-target="#carouselExample-cf" data-bs-slide-to="2"></li>
							</ol>
							<div class="carousel-inner">
								<div class="carousel-item active">
									<div class="row">
										<c:forEach var="entry" items="${mostWatchedContents}" begin="0" end="2" step="1">
											<div class="col-md-4 col-lg-4 mb-2">
												<div class="card h-100">
													<div class="card-body">
														<h5 class="card-title" style="color:lightseagreen;">${entry.key.contentName}</h5>
														<h6 class="card-subtitle text-muted" style="color:lightcoral">${entry.key.album}</h6>
														<p class="card-text">
															<br/>
															<c:forEach var="celebrity" items="${entry.key.celebrityList}" varStatus="loop">
																${celebrity.toString()}
																<c:if test="${!loop.last}">,</c:if>
															</c:forEach>
														</p>
														<a href="javascript:void(0);" class="card-link">Song link</a>
														<a href="javascript:void(0);" class="card-link">Add to WatchList</a>
													</div>
												</div>
											</div>
										</c:forEach>
									</div>
								</div>
								<div class="carousel-item">
									<div class="row">
										<c:forEach var="entry" items="${mostWatchedContents}" begin="3" end="5" step="1">
											<div class="col-md-4 col-lg-4 mb-2">
												<div class="card h-100">
													<div class="card-body">
														<h5 class="card-title" style="color:lightseagreen;">${entry.key.contentName}</h5>
														<h6 class="card-subtitle text-muted" style="color:lightcoral">${entry.key.album}</h6>
														<p class="card-text">
															<br/>
															<c:forEach var="celebrity" items="${entry.key.celebrityList}" varStatus="loop">
																${celebrity.toString()}
																<c:if test="${!loop.last}">,</c:if>
															</c:forEach>
														</p>
														<a href="javascript:void(0);" class="card-link">Song link</a>
														<a href="javascript:void(0);" class="card-link">Add to WatchList</a>
													</div>
												</div>
											</div>
										</c:forEach>
									</div>
								</div>
								<div class="carousel-item">
									<div class="row">
										<c:forEach var="entry" items="${mostWatchedContents}" begin="6" end="8" step="1">
											<div class="col-md-4 col-lg-4 mb-2">
												<div class="card h-100">
													<div class="card-body">
														<h5 class="card-title" style="color:lightseagreen;">${entry.key.contentName}</h5>
														<h6 class="card-subtitle text-muted" style="color:lightcoral">${entry.key.album}</h6>
														<p class="card-text">
															<br/>
															<c:forEach var="celebrity" items="${entry.key.celebrityList}" varStatus="loop">
																${celebrity.toString()}
																<c:if test="${!loop.last}">,</c:if>
															</c:forEach>
														</p>
														<a href="javascript:void(0);" class="card-link">Song link</a>
														<a href="javascript:void(0);" class="card-link">Add to WatchList</a>
													</div>
												</div>
											</div>
										</c:forEach>
									</div>
								</div>
							</div>
							<a class="carousel-control-prev" href="#carouselExample-cf" role="button" data-bs-slide="prev" style="margin-left:-105px;">
								<span class="carousel-control-prev-icon" aria-hidden="true"></span>
								<span class="visually-hidden">Previous</span>
							</a>
							<a class="carousel-control-next" href="#carouselExample-cf" role="button" data-bs-slide="next">
								<span class="carousel-control-next-icon" aria-hidden="true" style="margin-right:-200px;"></span>
								<span class="visually-hidden">Next</span>
							</a>
						</div>
					</div>
					<!-- / Content -->

					<div class="content-backdrop fade"></div>
				</div>
				<!-- Content wrapper -->
			</div>
			<!-- / Layout page -->
		</div>

		<!-- Overlay -->
		<div class="layout-overlay layout-menu-toggle"></div>
	</div>
	<!-- / Layout wrapper -->


	<!-- Core JS -->
	<!-- build:js assets/vendor/js/core.js -->
	<script src="../assets/vendor/libs/jquery/jquery.js"></script>
	<script src="../assets/vendor/libs/popper/popper.js"></script>
	<script src="../assets/vendor/js/bootstrap.js"></script>
	<script src="../assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.js"></script>

	<script src="../assets/vendor/js/menu.js"></script>
	<!-- endbuild -->

	<!-- Vendors JS -->
	<script src="../assets/vendor/libs/apex-charts/apexcharts.js"></script>

	<!-- Main JS -->
	<script src="../assets/js/main.js"></script>

	<!-- Page JS -->
	<script src="../assets/js/dashboards-analytics.js"></script>

	<!-- Place this tag in your head or just before your close body tag. -->
	<script async defer src="https://buttons.github.io/buttons.js"></script>
</body>
</html>
